package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TParam;

public interface TParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TParam record);

    int insertSelective(TParam record);

    TParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TParam record);

    int updateByPrimaryKey(TParam record);
}