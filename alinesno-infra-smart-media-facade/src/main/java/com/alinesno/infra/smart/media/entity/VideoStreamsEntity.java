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
@TableName("VideoStreams")
public class VideoStreamsEntity extends InfraBaseEntity {
	/**
	 * 视频流ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("视频流ID")
	@TableField("stream_id")
	private Long streamId;

	/**
	 * 用户ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("用户ID")
	@TableField("user_id")
	private Long userId;

	/**
	 * 视频流URL
	 */
	@ColumnType(length = 255)
	@ColumnComment("视频流URL")
	@TableField("stream_url")
	private String streamUrl;

	/**
	 * 上传时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("上传时间")
	@TableField("upload_time")
	private Date uploadTime;


}
