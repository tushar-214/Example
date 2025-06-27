package com.basics;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class SortedArray {
	public static void main(String[] args) {
		System.out.println("sorted Array List ");
		int ar[]= {1,3,5,12,67,22,2};
		List<Integer> list=Arrays.stream(ar).boxed().sorted().collect(Collectors.toList());
		System.out.println(list);
	}
}
