package com.utron.yw.dao;

import java.util.List;

import com.utron.yw.model.ResourceConfig;
@MyBatisRepository
public interface ResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResourceConfig record);

    int insertSelective(ResourceConfig record);

    ResourceConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResourceConfig record);

    int updateByPrimaryKey(ResourceConfig record);

	List<ResourceConfig> getResourceByParentId(ResourceConfig r);
}