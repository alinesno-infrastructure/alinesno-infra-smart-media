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
@TableName("SystemLogs")
public class SystemLogsEntity extends InfraBaseEntity {
	/**
	 * 日志ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("日志ID")
	@TableField("log_id")
	private Long logId;

	/**
	 * 用户ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("用户ID")
	@TableField("user_id")
	private Long userId;

	/**
	 * 日志描述
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("日志描述")
	@TableField("log_description")
	private String logDescription;

	/**
	 * 日志时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("日志时间")
	@TableField("log_time")
	private Date logTime;


}
