package com.basics.practice;

import java.util.Arrays;
import java.util.List;

public class DistinctElement {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,20,35,10);
		list.stream().distinct().forEach(System.out::println);
		
	}

}
