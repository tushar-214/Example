package com.basics;

import java.util.Arrays;

public class AdditionArray {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };
		int sum = Arrays.stream(ar).boxed().reduce(0, (a, b) -> a + b);
		System.out.println("Addition of array :: " + sum);
	}
}
