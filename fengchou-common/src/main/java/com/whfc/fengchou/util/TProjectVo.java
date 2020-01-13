package com.whfc.fengchou.util;

import java.util.ArrayList;
import java.util.List;

import com.atguigu.scw.project.bean.TReturn;

import lombok.Data;

/**
 * 查询项目时，封装项目的信息VO类
 * @author Administrator
 *
 */
@Data
public class TProjectVo {
	private Integer id; 
	private String name; 
	private String remark; 
	private Long money; 
	private Integer day; 
	private String status; 
	private String deploydate; 
	private Long supportmoney; 
	private Integer supporter; 
	private Integer completion; 
	private Integer memberid; 
	private String createdate; 
	private Integer follower; 
	private String headerImage; 
	private List<String> detailsImage = new ArrayList<>(); 
	// 项目的所有支持档位
	private List<TReturn> projectReturns = new ArrayList<>(); 
}
