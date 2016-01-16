package com.utron.yw.dao;

import com.utron.yw.model.OrderItemPrice;
@MyBatisRepository
public interface OrderItemPriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItemPrice record);

    int insertSelective(OrderItemPrice record);

    OrderItemPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItemPrice record);

    int updateByPrimaryKey(OrderItemPrice record);
}