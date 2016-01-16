package com.utron.yw.dao;

import com.utron.yw.model.SchemePrice;
@MyBatisRepository
public interface SchemePriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchemePrice record);

    int insertSelective(SchemePrice record);

    SchemePrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchemePrice record);

    int updateByPrimaryKey(SchemePrice record);
}