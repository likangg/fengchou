package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TMemberProjectFollow;

public interface TMemberProjectFollowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMemberProjectFollow record);

    int insertSelective(TMemberProjectFollow record);

    TMemberProjectFollow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMemberProjectFollow record);

    int updateByPrimaryKey(TMemberProjectFollow record);
}