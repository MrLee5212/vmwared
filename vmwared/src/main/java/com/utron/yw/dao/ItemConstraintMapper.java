package com.utron.yw.dao;

import com.utron.yw.model.ItemConstraint;
@MyBatisRepository
public interface ItemConstraintMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemConstraint record);

    int insertSelective(ItemConstraint record);

    ItemConstraint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemConstraint record);

    int updateByPrimaryKey(ItemConstraint record);
}