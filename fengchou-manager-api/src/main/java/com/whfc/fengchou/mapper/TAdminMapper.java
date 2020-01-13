package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TAdmin;

public interface TAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAdmin record);

    int insertSelective(TAdmin record);

    TAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAdmin record);

    int updateByPrimaryKey(TAdmin record);
}