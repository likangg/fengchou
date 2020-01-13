package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TMessage;

public interface TMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMessage record);

    int insertSelective(TMessage record);

    TMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMessage record);

    int updateByPrimaryKey(TMessage record);
}