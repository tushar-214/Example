package com.murli;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseList {
	public static void main(String[] args) {
		System.out.println("reverse Order ");
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		IntStream.range(0, list.size()).map(i-> list.get(list.size()-1-i)).forEach(System.out::println);
		
	}
}
