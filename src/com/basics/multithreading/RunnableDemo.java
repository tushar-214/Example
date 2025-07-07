package com.basics.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		RunDEmo rd=new RunDEmo();
		Thread t1=new Thread(rd);
		t1.start();
	}
}
