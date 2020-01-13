package com.whfc.fengchou.util;

import java.io.Serializable;

import lombok.Data;

/**
 * 调用订单服务时用于封装请求参数的VO类
 * @author Administrator
 *
 */
@Data
public class OrderInfoSubmitVo implements Serializable {
	private String accessToken;
	private Integer projectid;
	private Integer returnid;
	private Integer rtncount;

	private String address;
	private Byte invoice;
	private String invoictitle;
	private String remark;
}
