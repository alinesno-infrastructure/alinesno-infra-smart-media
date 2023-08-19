package com.alinesno.infra.smart.media.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * 检测框坐标
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("detection_coordinates")
public class DetectionCoordinatesEntity extends InfraBaseEntity {

    /**
     * 目标ID，关联到目标表的目标ID
     */
    @TableField("target_id")
    private Integer targetId;

    /**
     * 矩形框左上角的X坐标
     */
    @TableField("top_left_x")
    private Float topLeftX;

    /**
     * 矩形框左上角的Y坐标
     */
    @TableField("top_left_y")
    private Float topLeftY;

    /**
     * 矩形框右下角的X坐标
     */
    @TableField("bottom_right_x")
    private Float bottomRightX;

    /**
     * 矩形框右下角的Y坐标
     */
    @TableField("bottom_right_y")
    private Float bottomRightY;

    /**
     * 检测框坐标记录的创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    // 省略 getter 和 setter 方法


    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Float getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Float topLeftX) {
        this.topLeftX = topLeftX;
    }

    public Float getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Float topLeftY) {
        this.topLeftY = topLeftY;
    }

    public Float getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(Float bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public Float getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(Float bottomRightY) {
        this.bottomRightY = bottomRightY;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}