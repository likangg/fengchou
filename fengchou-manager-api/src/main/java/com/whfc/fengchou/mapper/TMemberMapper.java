package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TMember;

public interface TMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMember record);

    int insertSelective(TMember record);

    TMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMember record);

    int updateByPrimaryKey(TMember record);
}