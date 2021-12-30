package com.test;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class RegistrationForm {
	private Registration r = new Registration();
	String sql;
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of entry:");
		int n = sc.nextInt();
		
		while (n>0) {
			System.out.println("Please enter the registration details");
			System.out.println("Enter the id");
			String id = sc.next();
			
			r.setId(id);
			System.out.println("Enter the first name");
			String first_name = sc.next();
			r.setFirst_name(first_name);
			System.out.println("Enter the last name: ");
			String last_name = sc.next();
			r.setLast_name(last_name);
			System.out.println("Enter the mobile number");
			String mobile_number = sc.next();
			r.setPhone_number(mobile_number);
			System.out.println("Enter your gender");
			String gender = sc.next();
			r.setGender(gender);
			System.out.println("Enter your dob");
			String dob = sc.next();
			r.setDob(dob);
			System.out.println("Enter the password");
			String password = sc.next();
			r.setPassword(password);
			n--;
		}
	}
	
	public int save() {
			sql = "insert into registrationform values ("+ r.getId() + ",'" + r.getFirst_name()+ "','"+ r.getLast_name() +"','"+ 
			r.getPhone_number() + "','"+ r.getGender() +"','"+ r.getDob() + "','" + r.getPassword() +"')";
			
			return jdbcTemplate.update(sql);
		
	}
	
	public void updateData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String first_name = sc.next();
		r.setFirst_name(first_name);
		System.out.println("Enter the last name: ");
		String last_name = sc.next();
		r.setLast_name(last_name);	
	}
	
	public int update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the id to update:");
		int id = sc.nextInt();
		
		sql = "update registrationform set first_name = '"+r.getFirst_name()+"', last_name ='"+r.getLast_name()+"' where id = "+id+"";
		return jdbcTemplate.update(sql);
		
	}
	
	public int delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the id to delete:");
		int id = sc.nextInt();
		sql = "delete from registrationform where id ="+id+" ";
		return jdbcTemplate.update(sql);
	}

}
