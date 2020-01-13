package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TAccountTypeCert;

public interface TAccountTypeCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAccountTypeCert record);

    int insertSelective(TAccountTypeCert record);

    TAccountTypeCert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAccountTypeCert record);

    int updateByPrimaryKey(TAccountTypeCert record);
}