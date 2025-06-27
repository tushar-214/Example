package com.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrder {
	public static void main(String[] args) {
	
		System.out.println("sorted reverse Array List ");
		int ar[]= {1,3,5,12,67,22,2};
		List<Integer> list=Arrays.stream(ar).boxed().distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list);
		
	}

}
