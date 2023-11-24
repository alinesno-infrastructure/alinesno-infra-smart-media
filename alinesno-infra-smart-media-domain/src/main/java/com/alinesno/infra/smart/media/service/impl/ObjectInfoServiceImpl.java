package com.alinesno.infra.smart.media.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.smart.media.entity.ObjectInfoEntity;
import com.alinesno.infra.smart.media.mapper.ObjectInfoMapper;
import com.alinesno.infra.smart.media.service.IObjectInfoService;
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
public class ObjectInfoServiceImpl extends IBaseServiceImpl<ObjectInfoEntity, ObjectInfoMapper> implements IObjectInfoService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ObjectInfoServiceImpl.class);

}
