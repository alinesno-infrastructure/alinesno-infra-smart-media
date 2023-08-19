package com.alinesno.infra.smart.media.collector.handle;

import com.alinesno.infra.smart.media.collector.bean.CameraBean;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Kafka消息管理
 * 用于处理Kafka消息的类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@Component
public class StreamCollector {

	private static final Logger logger = Logger.getLogger(StreamCollector.class);

	@Autowired
	private KafkaTemplate<String, String> producer;

	/**
	 * 生成IoT事件
	 * @param producer Kafka消息生产者
	 * @throws Exception 异常
	 */
	private void genIoTEvent(KafkaTemplate<String, String> producer, CameraBean bean) throws Exception {
		logger.info("需要处理的URL总数为 " + bean);
		Thread t = new Thread(new EventGenerator(bean, producer)) ;
		t.start();
	}
}
