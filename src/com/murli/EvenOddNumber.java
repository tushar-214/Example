package com.murli;

import java.util.Arrays;
import java.util.List;

public class EvenOddNumber {
	public static void main(String[] args) {
		System.out.println("List of even Number ::");
	List<Integer> list=Arrays.asList(10,20,30,50,10,20,32,5,11,57);
	List<Integer> evenList=list.stream().filter(i-> i%2==0).toList();
	System.out.println(evenList);

	}

}
