package com.whfc.fengchou.util;

import java.io.Serializable;

import lombok.Data;

/**
 * 封装立即支付表单数据VO类
 * @author Administrator
 *
 */
@Data
public class OrderFormInfoSubmitVo implements Serializable{
	private String address;// 收货地址id
	private Byte invoice;// 0代表不要 1-代表要
	private String invoictitle;// 发票抬头
	private String remark;// 订单的备注
}
