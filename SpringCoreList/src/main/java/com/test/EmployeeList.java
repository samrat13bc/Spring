package com.test;


import java.util.List;

public class EmployeeList {
	private int id;
	private String name;
	private List<String> crs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCrs() {
		return crs;
	}
	public void setCrs(List<String> crs) {
		this.crs = crs;
	}
	
	public void disp() {
		System.out.println("ID : "+ id+" Name : " + name);
		
		for(String course : crs) {
			System.out.println(" " + course);
		}
	}

}
