package com.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		RegistrationForm r = (RegistrationForm)ctx.getBean("rform");
		//r.setData();
		//r.save();
		//r.delete();
		r.updateData();
		r.update();
		System.out.println("Done");
		
	}

}
