package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	Food f = (Food)ctx.getBean("fd");
	f.calculatePrice();
	}

}
