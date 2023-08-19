package com.alinesno.infra.smart.media.entity;

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
public class TargetTypesEntity extends InfraBaseEntity {

    /**
     * 类型的名称
     */
    @TableField("type_name")
    private String typeName;

    // 省略 getter 和 setter 方法

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}