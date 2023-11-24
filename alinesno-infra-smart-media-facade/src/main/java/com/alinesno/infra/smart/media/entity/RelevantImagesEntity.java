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
@TableName("RelevantImages")
public class RelevantImagesEntity extends InfraBaseEntity {
	/**
	 * 图片ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("图片ID")
	@TableField("image_id")
	private Long imageId;

	/**
	 * 物体信息ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("物体信息ID")
	@TableField("object_id")
	private Long objectId;

	/**
	 * 图片URL
	 */
	@ColumnType(length = 255)
	@ColumnComment("图片URL")
	@TableField("image_url")
	private String imageUrl;

	/**
	 * 保存时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("保存时间")
	@TableField("save_time")
	private Date saveTime;


}
