package com.practice2;

import java.util.Arrays;
import java.util.List;

public class listSorting {
	public static void main(String[] args) {
		System.out.println("Sorted List in Ascending order");
		List<Integer> list=Arrays.asList(10,24,75,22,89,7,111);
		list.stream().sorted().forEach(System.out::println);
		
	}

}
