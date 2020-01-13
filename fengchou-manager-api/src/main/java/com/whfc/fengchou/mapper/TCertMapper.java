package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TCert;

public interface TCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCert record);

    int insertSelective(TCert record);

    TCert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCert record);

    int updateByPrimaryKey(TCert record);
}