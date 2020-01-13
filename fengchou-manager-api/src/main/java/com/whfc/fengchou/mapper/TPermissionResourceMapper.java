package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TPermissionResource;

public interface TPermissionResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPermissionResource record);

    int insertSelective(TPermissionResource record);

    TPermissionResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPermissionResource record);

    int updateByPrimaryKey(TPermissionResource record);
}