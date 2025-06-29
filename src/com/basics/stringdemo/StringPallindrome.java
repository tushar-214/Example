package com.basics.stringdemo;

public class StringPallindrome {
	public static void main(String[] args) {
		String name="madam1";
		char[] ch=name.toCharArray();
		boolean flag=false;
		for(int i=0,j=ch.length-1;i<j;i++,j--)
		{
			if(ch[i]== ch[j])
			{
				flag=true;
			}
			
		}
		
		if(flag)
		{
		System.out.println("pallindrome");
		}else {
			
			System.out.println("not pallindrome");
		}
	}

}
