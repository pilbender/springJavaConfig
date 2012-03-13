package com.raescott.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Richard Scott Smith <scott.smith@isostech.com>
 */
@Configuration
public class JavaConfig {
	@Bean
	public JavaBean javaBean() {
		JavaBean javaBean = new JavaBean();
		javaBean.setName("Scott Smith");
		javaBean.setAge(35);
		return javaBean;
	}
}
