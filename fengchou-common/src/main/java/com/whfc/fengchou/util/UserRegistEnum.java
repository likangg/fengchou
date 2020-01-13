package com.whfc.fengchou.util;

/**
 * 用户注册的状态枚举类
 * @author Administrator
 *
 */
public enum UserRegistEnum {

	CODE_ERROR(1,"手机验证码校验错误"),
	LOGINACCT_LOCKED(2,"账号被锁定"),
	LOGINACCT_EXISTS(3,"账号已经存在"),
	EMAIL_EXISTS(4,"邮箱已经被使用");
	
	private Integer code ;
	private String msg ;
	
	private UserRegistEnum() {
	}
	private UserRegistEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
