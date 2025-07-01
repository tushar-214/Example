package com.basics.stringdemo;

public class StringAddition {
	public static void main(String[] args) {
		String str="1234";
		int num=Integer.parseInt(str);
		int sum=0,rem=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		
		System.out.println("Addition of string charcter");
		System.out.println(sum);
	}

}
