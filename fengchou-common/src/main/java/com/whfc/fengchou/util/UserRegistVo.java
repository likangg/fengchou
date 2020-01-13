package com.whfc.fengchou.util;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 封装注册信息的VO类
 * @author Administrator
 *
 */
@ApiModel
@Data
@ToString
public class UserRegistVo  implements Serializable{
	@ApiModelProperty("手机号")
	private String loginacct;
	@ApiModelProperty("密码")
	private String userpswd;
	@ApiModelProperty("邮箱")
	private String email;
	@ApiModelProperty("验证码")
	private String code;
}
