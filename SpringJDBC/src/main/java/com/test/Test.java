package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("appComponent.xml");
	BookDao obj = (BookDao)ctx.getBean("bdao");
	Book b = new Book(102, "2 States", "Chetan Bhagat");
	obj.save(b);
	
	List<Book> list = obj.listBooks();
	
	for(Book bo : list) {
		System.out.println("ID: "+ bo.getId()+" Name: "+ bo.getName()+" Author : "+ bo.getAuthor());
	}
	System.out.println("Done");
	
	}

}
