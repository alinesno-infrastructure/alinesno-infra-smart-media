package com.alinesno.infra.smart.media.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.smart.media.entity.ApplicationEntity;
import com.alinesno.infra.smart.media.mapper.ApplicationMapper;
import com.alinesno.infra.smart.media.service.IApplicationService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * Application服务实现类
 * </p>
 *
 * @version 1.0.0
 */
@Service
public class ApplicationServiceImpl extends IBaseServiceImpl<ApplicationEntity, ApplicationMapper> implements IApplicationService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ApplicationServiceImpl.class);

}