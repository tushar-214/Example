package com.basics.practice;

import java.util.Arrays;

public class StreamAPi {
	public static void main(String[] args) {
		int ar[]= {1,2,3,34,56,89,19};
		Arrays.stream(ar).boxed().sorted().forEach(System.out::println);
	}

}
