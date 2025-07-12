package com.murli;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
		System.out.println("max Number ");
		List<Integer> list = Arrays.asList(10, 20, 30, 50, 10, 20);
		Integer max = list.stream().max((a, b) -> a - b).orElse(0);
		System.out.println("Max number " + max);
	}
}
