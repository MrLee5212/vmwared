package com.utron.yw.dao;

import com.utron.yw.model.ResourceRole;
@MyBatisRepository
public interface ResourceRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResourceRole record);

    int insertSelective(ResourceRole record);

    ResourceRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResourceRole record);

    int updateByPrimaryKey(ResourceRole record);
}