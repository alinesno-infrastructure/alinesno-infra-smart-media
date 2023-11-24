package com.alinesno.infra.smart.media.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.smart.media.entity.MediaFilesEntity;
import com.alinesno.infra.smart.media.mapper.MediaFilesMapper;
import com.alinesno.infra.smart.media.service.IMediaFilesService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * MediaFiles服务实现类
 * </p>
 *
 * @version 1.0.0
 */
@Service
public class MediaFilesServiceImpl extends IBaseServiceImpl<MediaFilesEntity, MediaFilesMapper> implements IMediaFilesService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(MediaFilesServiceImpl.class);

}