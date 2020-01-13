package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TProject;

public interface TProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TProject record);

    int insertSelective(TProject record);

    TProject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TProject record);

    int updateByPrimaryKey(TProject record);
}