package com.alinesno.infra.smart.media.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.smart.media.entity.TargetInfoEntity;
import com.alinesno.infra.smart.media.mapper.TargetInfoMapper;
import com.alinesno.infra.smart.media.service.ITargetInfoService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * TargetInfo服务实现类
 * </p>
 *
 * @version 1.0.0
 */
@Service
public class TargetInfoServiceImpl extends IBaseServiceImpl<TargetInfoEntity, TargetInfoMapper> implements ITargetInfoService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(TargetInfoServiceImpl.class);

}