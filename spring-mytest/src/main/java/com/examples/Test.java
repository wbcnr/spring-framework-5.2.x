package com.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试spring framework 5.2.x源码
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("测试spring framework 5.2.x源码");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user);
	}
}
