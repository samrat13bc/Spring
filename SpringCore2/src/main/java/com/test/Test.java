package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		Product pr = (Product)ctx.getBean("pr1");
		pr.disp();
		Product p = (Product)ctx.getBean("pr2");
		p.disp();
	}

}
