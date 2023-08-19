package com.alinesno.infra.smart.media.collector.bean;

import org.apache.kafka.clients.producer.Producer;

/**
 * 摄像头信息类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
public class CameraBean {

    private String cameraId;
    private String tenantId ;
    private String url;
    private Producer<String, String> producer;
    private String topic;

    /**
     * 获取摄像头ID
     *
     * @return 摄像头ID
     */
    public String getCameraId() {
        return cameraId;
    }

    /**
     * 设置摄像头ID
     *
     * @param cameraId 摄像头ID
     */
    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    /**
     * 获取租户ID
     *
     * @return 租户ID
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * 设置租户ID
     *
     * @param tenantId 租户ID
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * 获取摄像头URL
     *
     * @return 摄像头URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置摄像头URL
     *
     * @param url 摄像头URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取Kafka生产者
     *
     * @return Kafka生产者
     */
    public Producer<String, String> getProducer() {
        return producer;
    }

    /**
     * 设置Kafka生产者
     *
     * @param producer Kafka生产者
     */
    public void setProducer(Producer<String, String> producer) {
        this.producer = producer;
    }

    /**
     * 获取Kafka主题
     *
     * @return Kafka主题
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 设置Kafka主题
     *
     * @param topic Kafka主题
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
}
