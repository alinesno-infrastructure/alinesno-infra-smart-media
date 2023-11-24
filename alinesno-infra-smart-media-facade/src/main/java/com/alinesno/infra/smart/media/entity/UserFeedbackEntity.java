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
@TableName("UserFeedback")
public class UserFeedbackEntity extends InfraBaseEntity {
	/**
	 * 反馈ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("反馈ID")
	@TableField("feedback_id")
	private Long feedbackId;

	/**
	 * 物体信息ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("物体信息ID")
	@TableField("object_id")
	private Long objectId;

	/**
	 * 用户ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("用户ID")
	@TableField("user_id")
	private Long userId;

	/**
	 * 反馈内容
	 */
	@ColumnType(MySqlTypeConstant.TEXT)
	@ColumnComment("反馈内容")
	@TableField("feedback_text")
	private String feedbackText;

	/**
	 * 反馈时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("反馈时间")
	@TableField("feedback_time")
	private Date feedbackTime;


}
