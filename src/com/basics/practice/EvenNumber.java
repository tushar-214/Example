package com.basics.practice;

import java.util.Arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int ar[]= {13,2,3,45,78,54,32,23};
				Arrays.stream(ar).boxed().distinct().filter( a-> a%2==0).forEach(System.out::print);	
	}

	
}