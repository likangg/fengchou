package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TProjectTag;

public interface TProjectTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TProjectTag record);

    int insertSelective(TProjectTag record);

    TProjectTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TProjectTag record);

    int updateByPrimaryKey(TProjectTag record);
}