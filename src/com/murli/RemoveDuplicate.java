package com.murli;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {
		System.out.println("Remove Duplicate ");
		
		List<Integer> list=Arrays.asList(10,20,30,50,10,20);
		list.stream().distinct().forEach(System.out::println);
	}

}
