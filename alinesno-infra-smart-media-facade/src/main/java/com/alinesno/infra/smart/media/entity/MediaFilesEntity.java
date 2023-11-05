package com.alinesno.infra.smart.media.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 流媒体文件
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("media_files")
@Data
public class MediaFilesEntity extends InfraBaseEntity {

    /**
     * 文件的名称
     */
    @TableField("file_name")
	@ColumnType(length=255)
	@ColumnComment("文件的名称")
    private String fileName;

    /**
     * 文件的路径
     */
    @TableField("file_path")
	@ColumnType(length=255)
	@ColumnComment("文件的路径")
    private String filePath;
}
