package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TTransaction;

public interface TTransactionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TTransaction record);

    int insertSelective(TTransaction record);

    TTransaction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TTransaction record);

    int updateByPrimaryKey(TTransaction record);
}