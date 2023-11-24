package com.alinesno.infra.smart.media.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.smart.media.entity.VideoStreamsEntity;
import com.alinesno.infra.smart.media.mapper.VideoStreamsMapper;
import com.alinesno.infra.smart.media.service.IVideoStreamsService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Service
public class VideoStreamsServiceImpl extends IBaseServiceImpl<VideoStreamsEntity, VideoStreamsMapper> implements IVideoStreamsService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(VideoStreamsServiceImpl.class);

}
