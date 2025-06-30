package com.basics.sorting;

public class Student {
	private int sid;
	private String name;
	private int roll;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", roll=" + roll + "]";
	}
	public Student(int sid, String name, int roll) {
		super();
		this.sid = sid;
		this.name = name;
		this.roll = roll;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
