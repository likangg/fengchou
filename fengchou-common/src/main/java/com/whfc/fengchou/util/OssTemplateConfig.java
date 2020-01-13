package com.whfc.fengchou.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.scw.component.OssTemplate;

/**
 * OSS云存储服务的模板对象配置类
 * @author Administrator
 *
 */
@Configuration
public class OssTemplateConfig {

	@ConfigurationProperties(prefix="oss")
	@Bean
	public OssTemplate ossTemplate() {
		return new OssTemplate();
	}
	
}
