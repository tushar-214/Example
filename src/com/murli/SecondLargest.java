package com.murli;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 50, 40, 5);
		Integer secondLarge = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(0);
		System.out.println("second Largest :: " + secondLarge);
	}

}
