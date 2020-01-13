package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TTag;

public interface TTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TTag record);

    int insertSelective(TTag record);

    TTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TTag record);

    int updateByPrimaryKey(TTag record);
}