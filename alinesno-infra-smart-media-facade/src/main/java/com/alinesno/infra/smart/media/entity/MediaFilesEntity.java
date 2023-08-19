package com.alinesno.infra.smart.media.entity;

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
public class MediaFilesEntity extends InfraBaseEntity {

    /**
     * 文件的名称
     */
    @TableField("file_name")
    private String fileName;

    /**
     * 文件的路径
     */
    @TableField("file_path")
    private String filePath;

    // 省略 getter 和 setter 方法

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}