package com.murli;
import java.util.stream.IntStream;

public class PallidromeString {
	public static void main(String[] args) {
		String str="madam";
	Boolean res=IntStream.range(0, str.length()-1/2).allMatch(i->str.charAt(i)== str.charAt(str.length()-1-i));
	System.out.println("given string is pallindrome = " +res);

	}

}
