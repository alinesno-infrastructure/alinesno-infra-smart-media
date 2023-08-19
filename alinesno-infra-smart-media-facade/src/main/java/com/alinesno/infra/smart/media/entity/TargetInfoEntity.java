package com.alinesno.infra.smart.media.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * 检测目录表
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("target_info")
public class TargetInfoEntity extends InfraBaseEntity {

    /**
     * 租户ID
     */
    @TableField("tenant_id")
    private String tenantId;

    /**
     * 图片URL
     */
    @TableField("image_url")
    private String imageUrl;

    /**
     * 目标类别
     */
    @TableField("category")
    private String category;

    /**
     * 目标识别置信度
     */
    @TableField("confidence")
    private Float confidence;

    /**
     * 目标记录创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 目标特征向量
     */
    @TableField("feature")
    private String feature;

    /**
     * 目标计数
     */
    @TableField("count")
    private Integer count;

    // 省略 getter 和 setter 方法


    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}