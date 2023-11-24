package com.alinesno.infra.smart.media.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.smart.media.entity.DetectionCoordinatesEntity;
import com.alinesno.infra.smart.media.mapper.DetectionCoordinatesMapper;
import com.alinesno.infra.smart.media.service.IDetectionCoordinatesService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * DetectionCoordinates服务实现类
 * </p>
 *
 * @version 1.0.0
 */
@Service
public class DetectionCoordinatesServiceImpl extends IBaseServiceImpl<DetectionCoordinatesEntity, DetectionCoordinatesMapper> implements IDetectionCoordinatesService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(DetectionCoordinatesServiceImpl.class);

}