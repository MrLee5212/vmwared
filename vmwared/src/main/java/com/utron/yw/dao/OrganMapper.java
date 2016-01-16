package com.utron.yw.dao;

import com.utron.yw.model.Organ;
@MyBatisRepository
public interface OrganMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Organ record);

    int insertSelective(Organ record);

    Organ selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Organ record);

    int updateByPrimaryKey(Organ record);
}