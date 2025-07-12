package com.murli;

import java.util.Arrays;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		System.out.println("array Sorting ");
		List<Integer> list=Arrays.asList(10,34,2,1,35);
		list.stream().sorted().forEach(System.out::println);
	}

}
