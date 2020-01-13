package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TProjectType;

public interface TProjectTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TProjectType record);

    int insertSelective(TProjectType record);

    TProjectType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TProjectType record);

    int updateByPrimaryKey(TProjectType record);
}