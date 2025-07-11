package com.practice2;

import java.util.stream.IntStream;

public class Pallindrome {
	public static void main(String[] args) {
		String name="madam";
	Boolean	res=IntStream.range(0, name.length()/2).allMatch(i->name.charAt(i) == name.charAt(name.length()-i-1));  
	if(res)
	{
		System.out.println("its pallindrome");
	}else {
		
		System.out.println("its Not pallindrome");

	}
	}

}
