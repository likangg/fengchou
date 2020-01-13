package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TMemberAddress;

public interface TMemberAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMemberAddress record);

    int insertSelective(TMemberAddress record);

    TMemberAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMemberAddress record);

    int updateByPrimaryKey(TMemberAddress record);
}