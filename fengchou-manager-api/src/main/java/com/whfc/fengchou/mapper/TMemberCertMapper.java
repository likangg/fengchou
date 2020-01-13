package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TMemberCert;

public interface TMemberCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMemberCert record);

    int insertSelective(TMemberCert record);

    TMemberCert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMemberCert record);

    int updateByPrimaryKey(TMemberCert record);
}