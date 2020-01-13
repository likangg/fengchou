package com.whfc.fengchou.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WEB项目的SpringMVC配置类
 * @author Administrator
 *
 */
@Configuration
public class AppWebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		
		//等价于<mvc:view-controller path="/index" view-name="index"/>
		//也就是等价于代码：
		//	@RequestMapping(value= {"/index","/"})
		//	public String index() {
		//		return "index";
		//	}
		//registry.addViewController("/index").setViewName("index");
		//registry.addViewController("/").setViewName("index");
		//registry.addViewController("/login").setViewName("login");
	}
	
}
