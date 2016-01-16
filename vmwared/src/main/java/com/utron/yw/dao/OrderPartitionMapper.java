package com.utron.yw.dao;

import com.utron.yw.model.OrderPartition;
@MyBatisRepository
public interface OrderPartitionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderPartition record);

    int insertSelective(OrderPartition record);

    OrderPartition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderPartition record);

    int updateByPrimaryKey(OrderPartition record);
}