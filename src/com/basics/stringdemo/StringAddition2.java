package com.basics.stringdemo;

public class StringAddition2 {
	public static void main(String[] args) {
		String str="1223";
		int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			sum=sum+Character.getNumericValue(str.charAt(i));
		}
		
		System.out.println("sum :: "+sum);
	}

}
