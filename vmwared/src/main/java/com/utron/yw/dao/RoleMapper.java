package com.utron.yw.dao;

import com.utron.yw.model.Role;
@MyBatisRepository
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}