package com.basics.stringdemo;
public class RemoveDuplicate {
public static void main(String[] args) {
	String name="programming";
	int [] ch=new int[256];
	
	for(char c: name.toCharArray())
	{
		ch[c]++;
	}
	
	// here we have create the array of 256 and the there ascii code 
	
	// in the based on the asci
	// added
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>1)
		{
			System.out.println((char)i);
			
		}
		
	}
	
}
}
