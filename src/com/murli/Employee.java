package com.murli;

public class Employee {
	private int id;
	private String name;
	private double salaryl;

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

	public double getSalaryl() {
		return salaryl;
	}

	public void setSalaryl(double salaryl) {
		this.salaryl = salaryl;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaryl=" + salaryl + "]";
	}

	public Employee(int id, String name, double salaryl) {
		super();
		this.id = id;
		this.name = name;
		this.salaryl = salaryl;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
