package com.murli;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 50, 10, 20);
		Set<Integer> dupli = new HashSet<Integer>();
		list.stream().filter(i-> !dupli.add(i)).distinct().forEach(System.out::println);
		
		System.out.println(dupli);

	}
}
