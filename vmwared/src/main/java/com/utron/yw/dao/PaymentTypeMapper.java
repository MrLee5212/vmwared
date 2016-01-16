package com.utron.yw.dao;

import com.utron.yw.model.PaymentType;
@MyBatisRepository
public interface PaymentTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentType record);

    int insertSelective(PaymentType record);

    PaymentType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentType record);

    int updateByPrimaryKey(PaymentType record);
}