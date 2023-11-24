package com.alinesno.infra.smart.media.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Data
@TableName("ObjectInfo")
public class ObjectInfoEntity extends InfraBaseEntity {
	/**
	 * 物体信息ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("物体信息ID")
	@TableField("object_id")
	private Long objectId;

	/**
	 * 视频流ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("视频流ID")
	@TableField("stream_id")
	private Long streamId;

	/**
	 * 帧数
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("帧数")
	@TableField("frame_number")
	private Long frameNumber;

	/**
	 * 物体类别
	 */
	@ColumnType(length = 50)
	@ColumnComment("物体类别")
	@TableField("object_category")
	private String objectCategory;

	/**
	 * 物体位置
	 */
	@ColumnType(length = 255)
	@ColumnComment("物体位置")
	@TableField("object_location")
	private String objectLocation;

	/**
	 * 识别时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("识别时间")
	@TableField("recognition_time")
	private Date recognitionTime;


}
