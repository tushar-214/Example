package com.basics.lembda;

public class AdditionDemo {

	public static void main(String[] args) {
		Addition add=(a,b)->{
			return a+b;
			
		};
		
		
		int sum=add.addition(100, 500);
		
		System.out.println("addition of two number  :: "+sum);
	}
}
