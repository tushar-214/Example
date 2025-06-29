package com.basics.stringdemo;

public class RevsersString {
	public static void main(String[] args) {
		
		String name="tushar";
		char[] ch=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
			
		}
		
		
	}

}
