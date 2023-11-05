package com.alinesno.infra.smart.media.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 目标类型
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("target_types")
@Data
public class TargetTypesEntity extends InfraBaseEntity {

    /**
     * 类型的名称
     */
    @TableField("type_name")
	@ColumnType(length=50)
	@ColumnComment("类型的名称")
    private String typeName;
}
