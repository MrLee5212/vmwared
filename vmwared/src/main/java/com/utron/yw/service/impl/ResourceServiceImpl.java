package com.utron.yw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.utron.yw.dao.ResourceMapper; 
import com.utron.yw.model.ResourceConfig;
import com.utron.yw.service.ResourceService;
@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {

	@Resource
	private ResourceMapper resourceMapper;
	@Override
	public List<ResourceConfig> getResource(Integer resourceType) {
		// TODO Auto-generated method stub
		ResourceConfig r = new ResourceConfig();
		r.setResourceType(resourceType);
		r.setParentId(0);
		return resourceMapper.getResourceByParentId(r);
	}

	@Override
	public List<ResourceConfig> getResourceByParentId(Integer id) {
		// TODO Auto-generated method stub
		ResourceConfig r = new ResourceConfig(); 
		r.setParentId(id);
		return resourceMapper.getResourceByParentId(r);
	}

}
