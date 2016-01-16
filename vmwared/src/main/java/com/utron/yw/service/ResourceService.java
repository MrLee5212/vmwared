package com.utron.yw.service;

import java.util.List;

import com.utron.yw.model.ResourceConfig;

public interface ResourceService { 

	List<ResourceConfig> getResource(Integer resourceType);

	List<ResourceConfig> getResourceByParentId(Integer id);

}
