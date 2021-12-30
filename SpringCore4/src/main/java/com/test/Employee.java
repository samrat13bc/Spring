package com.test;


import java.util.Scanner;

public class Employee {
	private int n =5; 
	int [] lId = new int [n];
	String [] lName = new String [n];
	String[]  lDept= new String[n];
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	
	
	public void addEmployee() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i< n; i++) {
			System.out.println("Please enter the Employee Id:");
			int id = sc.nextInt();
			lId[i]=id;
			System.out.println("Please enter the Employee Name ");
			String name = sc.next();
			lName[i] = name;
			System.out.println("Please enter the dept");
			String dept = sc.next();
			lDept[i] = dept;
		}
	}
	public void employeeDetails() {
		
		for (int i = 0; i< n ; i++ ) {
			System.out.println("EmpId : "+ lId[i] + " "+ lName[i] + " from " +lDept[i] );
		}
		
	}

}
