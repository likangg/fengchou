package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TPermissionMenu;

public interface TPermissionMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPermissionMenu record);

    int insertSelective(TPermissionMenu record);

    TPermissionMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPermissionMenu record);

    int updateByPrimaryKey(TPermissionMenu record);
}