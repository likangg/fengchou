package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TResource;

public interface TResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TResource record);

    int insertSelective(TResource record);

    TResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TResource record);

    int updateByPrimaryKey(TResource record);
}