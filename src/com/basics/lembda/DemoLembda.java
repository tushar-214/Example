package com.basics.lembda;

public class DemoLembda  {
	public static void main(String[] args) {
		Test test = () -> {
			System.out.println("this is the Demo functional interface demo");
		};
		test.m1();
		
	}

}
