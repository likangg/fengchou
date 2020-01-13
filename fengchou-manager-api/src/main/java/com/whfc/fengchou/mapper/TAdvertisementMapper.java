package com.whfc.fengchou.mapper;

import com.whfc.fengchou.bean.TAdvertisement;

public interface TAdvertisementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TAdvertisement record);

    int insertSelective(TAdvertisement record);

    TAdvertisement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAdvertisement record);

    int updateByPrimaryKey(TAdvertisement record);
}