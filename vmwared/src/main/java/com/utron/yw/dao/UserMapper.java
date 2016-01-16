package com.utron.yw.dao;

import com.utron.yw.model.User;
@MyBatisRepository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User getUserByName(User temp);
}