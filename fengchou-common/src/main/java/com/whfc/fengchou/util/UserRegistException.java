package com.whfc.fengchou.util;

import com.atguigu.scw.user.enums.UserRegistEnum;

/**
 * 用户注册的异常类
 * @author Administrator
 *
 */
public class UserRegistException extends RuntimeException {

	public UserRegistException(UserRegistEnum enums) {
		super(enums.getMsg());
	}
	
}
