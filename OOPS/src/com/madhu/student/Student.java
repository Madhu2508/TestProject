package com.madhu.student;

public class Student {
	
	private Integer roll_no;
	private String name;
	private String address;
	
	public Student(Integer roll_no, String name, String address) {
		this.roll_no= roll_no;
		this.name= name;
		this.address= address;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("RollNo:"+this.roll_no+" "+"Name:"+this.name+" "+"Address:"+this.address);
	}

}
