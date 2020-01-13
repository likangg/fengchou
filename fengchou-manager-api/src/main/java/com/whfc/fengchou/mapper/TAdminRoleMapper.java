package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TAdminRole;

public interface TAdminRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAdminRole record);

    int insertSelective(TAdminRole record);

    TAdminRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAdminRole record);

    int updateByPrimaryKey(TAdminRole record);
}