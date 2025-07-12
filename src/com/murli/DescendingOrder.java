package com.murli;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder {
	public static void main(String[] args) {
		System.out.println("sort descendiing order ");
		List<Integer> list=Arrays.asList(10,20,30,50,40,5);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
