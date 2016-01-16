package com.utron.yw.dao;

import com.utron.yw.model.ConfigItem;
@MyBatisRepository
public interface ConfigItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigItem record);

    int insertSelective(ConfigItem record);

    ConfigItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigItem record);

    int updateByPrimaryKey(ConfigItem record);
}