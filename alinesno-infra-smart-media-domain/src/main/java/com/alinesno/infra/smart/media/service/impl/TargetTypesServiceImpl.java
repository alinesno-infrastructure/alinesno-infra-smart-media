package com.alinesno.infra.smart.media.service.impl;

import com.alinesno.infra.smart.media.service.ITargetTypesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.smart.media.entity.TargetTypesEntity;
import com.alinesno.infra.smart.media.mapper.TargetTypesMapper;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * TargetTypes服务实现类
 * </p>
 *
 * @version 1.0.0
 */
@Service
public class TargetTypesServiceImpl extends IBaseServiceImpl<TargetTypesEntity, TargetTypesMapper> implements ITargetTypesService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(TargetTypesServiceImpl.class);

}