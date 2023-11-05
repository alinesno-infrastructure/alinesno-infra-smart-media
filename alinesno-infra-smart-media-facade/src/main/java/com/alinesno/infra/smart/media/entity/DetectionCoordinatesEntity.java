package com.alinesno.infra.smart.media.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class DetectionCoordinatesEntity extends InfraBaseEntity {

    /**
     * 目标ID，关联到目标表的目标ID
     */
    @TableField("target_id")
	@ColumnType(length=50)
	@ColumnComment("目标ID，关联到目标表的目标ID")
    private Integer targetId;

    /**
     * 矩形框左上角的X坐标
     */
    @TableField("top_left_x")
	@ColumnType(length=10)
	@ColumnComment("矩形框左上角的X坐标")
    private Float topLeftX;

    /**
     * 矩形框左上角的Y坐标
     */
    @TableField("top_left_y")
	@ColumnType(length=4)
	@ColumnComment("矩形框左上角的Y坐标")
    private Float topLeftY;

    /**
     * 矩形框右下角的X坐标
     */
    @TableField("bottom_right_x")
	@ColumnType(length=10)
	@ColumnComment("矩形框右下角的X坐标")
    private Float bottomRightX;

    /**
     * 矩形框右下角的Y坐标
     */
    @TableField("bottom_right_y")
	@ColumnType(length=4)
	@ColumnComment("矩形框右下角的Y坐标")
    private Float bottomRightY;

    /**
     * 检测框坐标记录的创建时间
     */
    @TableField("create_time")
	@ColumnType(length=19)
	@ColumnComment("检测框坐标记录的创建时间")
    private LocalDateTime createTime;
}
