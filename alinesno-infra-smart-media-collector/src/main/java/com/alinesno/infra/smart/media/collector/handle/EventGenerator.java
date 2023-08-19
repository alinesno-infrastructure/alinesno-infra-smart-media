package com.alinesno.infra.smart.media.collector.handle;

import java.sql.Timestamp;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;

import com.alinesno.infra.smart.media.collector.bean.CameraBean;
import org.apache.commons.lang.StringUtils;
import org.apache.kafka.clients.producer.*;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.K;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

/**
 * 事件生成器，用于生成帧的JSON事件
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
public class EventGenerator implements Runnable {

	private static final Logger log = Logger.getLogger(EventGenerator.class);

	private KafkaTemplate<String, String> producer;
	private static Gson gson = new Gson();

	private CameraBean bean ;

	/**
	 * 构造函数
	 *
	 * @param producer  Kafka生产者
	 */
	public EventGenerator(CameraBean bean, KafkaTemplate<String, String> producer) {
		this.producer = producer;
		this.bean = bean ;
	}

	// 加载OpenCV本地库
	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	@Override
	public void run() {
		log.info("正在处理 cameraId=" + bean.getCameraId()+ "，URL=" + bean.getUrl());
		try {
			generateEvent(bean, producer) ;
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	/**
	 * 为帧生成JSON事件
	 *
	 * @param producer  Kafka生产者
	 * @throws Exception 生成事件时可能抛出的异常
	 */
	private void generateEvent(CameraBean bean, KafkaTemplate<String, String> producer) throws Exception {
		VideoCapture camera = null;
		if (StringUtils.isNumeric(bean.getUrl())) {
			camera = new VideoCapture(Integer.parseInt(bean.getCameraId()));
		} else {
			camera = new VideoCapture(bean.getUrl());
		}
		// 检查摄像头是否正常工作
		if (!camera.isOpened()) {
			Thread.sleep(5000);
			if (!camera.isOpened()) {
				throw new Exception("打开 cameraId=" + bean.getCameraId() + "，URL=" + bean.getUrl()+ " 的摄像头时出错。请在属性文件的 camera.url 键中设置正确的文件路径或URL。");
			}
		}
		Mat mat = new Mat();
		while (camera.read(mat)) {
			// 调整发送前的图像大小
			Imgproc.resize(mat, mat, new Size(640, 480), 0, 0, Imgproc.INTER_CUBIC);

			int cols = mat.cols();
			int rows = mat.rows();
			int type = mat.type();
			byte[] data = new byte[(int) (mat.total() * mat.channels())];

			mat.get(0, 0, data);
			String timestamp = new Timestamp(System.currentTimeMillis()).toString();

			JsonObject obj = new JsonObject();

			obj.addProperty("cameraId", bean.getCameraId());
			obj.addProperty("tenantId", bean.getTenantId());
			obj.addProperty("timestamp", timestamp);
			obj.addProperty("rows", rows);
			obj.addProperty("cols", cols);
			obj.addProperty("type", type);
			obj.addProperty("data", Base64.getEncoder().encodeToString(data));

			String json = gson.toJson(obj);

			CompletableFuture<SendResult<String, String>> result =  producer.send(new ProducerRecord<String , String>(bean.getTopic() , json));
			// 在需要获取回调信息的地方，可以使用result对象进行等待和处理
			result.whenComplete((sendResult, throwable) -> {
				if (throwable == null) {
					// 发送成功
					RecordMetadata metadata = sendResult.getRecordMetadata();
					String partition = String.valueOf(metadata.partition());
					String offset = String.valueOf(metadata.offset());
					System.out.println("消息发送成功，partition: " + partition + ", offset: " + offset);
				} else {
					// 发送失败
					log.error("error = " + throwable.getMessage());
				}
			});

			log.info("为 cameraId=" + bean.getCameraId()+ " 生成事件，时间戳=" + timestamp);
		}
		camera.release();
		mat.release();
	}

}
