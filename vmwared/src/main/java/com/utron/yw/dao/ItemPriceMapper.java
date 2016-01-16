package com.utron.yw.dao;

import com.utron.yw.model.ItemPrice;
@MyBatisRepository
public interface ItemPriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemPrice record);

    int insertSelective(ItemPrice record);

    ItemPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemPrice record);

    int updateByPrimaryKey(ItemPrice record);
}