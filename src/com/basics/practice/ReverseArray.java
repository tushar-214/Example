package com.basics.practice;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseArray {
	public static void main(String[] args) {
		int [] ar= {10,20,30,40,50,60};
		Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
