package com.raescott.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Richard Scott Smith <scott.smith@isostech.com>
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		JavaBean javaBean = applicationContext.getBean(JavaBean.class);
		System.out.println("Name: " + javaBean.getName());
		System.out.println("Age: " + javaBean.getAge());
	}

}
