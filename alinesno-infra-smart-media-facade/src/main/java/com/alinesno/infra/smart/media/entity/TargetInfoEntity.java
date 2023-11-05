package com.alinesno.infra.smart.media.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class TargetInfoEntity extends InfraBaseEntity {

    /**
     * 租户ID
     */
    @TableField("tenant_id")
	@ColumnType(length=50)
	@ColumnComment("租户ID")
    private String tenantId;

    /**
     * 图片URL
     */
    @TableField("image_url")
	@ColumnType(length=255)
	@ColumnComment("图片URL")
    private String imageUrl;

    /**
     * 目标类别
     */
    @TableField("category")
	@ColumnType(length=50)
	@ColumnComment("目标类别")
    private String category;

    /**
     * 目标识别置信度
     */
    @TableField("confidence")
	@ColumnType(length=2)
	@ColumnComment("目标识别置信度")
    private Float confidence;

    /**
     * 目标记录创建时间
     */
    @TableField("create_time")
	@ColumnType(length=19)
	@ColumnComment("目标记录创建时间")
    private LocalDateTime createTime;

    /**
     * 目标特征向量
     */
    @TableField("feature")
	@ColumnType(length=255)
	@ColumnComment("目标特征向量")
    private String feature;

    /**
     * 目标计数
     */
    @TableField("count")
	@ColumnType(length=10)
	@ColumnComment("目标计数")
    private Integer count;
}
