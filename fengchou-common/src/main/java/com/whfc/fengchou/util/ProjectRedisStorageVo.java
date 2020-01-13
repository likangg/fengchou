package com.whfc.fengchou.util;

import java.util.List;

import com.atguigu.scw.project.bean.TReturn;
import com.atguigu.scw.vo.req.BaseVo;

import lombok.Data;

/**
 * 大VO对象，用于接收每一页的表单数据。
 * 最终提交项目时，将大VO对象封装的数据，一部分一部分的保存到对应的表中。
 */
@Data
public class ProjectRedisStorageVo extends BaseVo{
	//全量   增量    
    private String projectToken;//项目的临时token 
    private Integer memberid;//会员id 
    
    
    private List<Integer> typeids; //项目的分类id 
    private List<Integer> tagids; //项目的标签id 
    
    private String name;//项目名称 
    private String remark;//项目简介 
    private Integer money;//筹资金额 
    private Integer day;//筹资天数 
    
    private String headerImage;//项目头部图片 
    private List<String> detailsImage;//项目详情图片 
    
    
    private List<TReturn> projectReturns;//项目回报 
    //发起人信息：自我介绍，详细自我介绍，联系电话，客服电话

    //法人信息：支付宝账号，法人身份证
}
