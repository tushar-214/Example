package com.murli;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
	public static void main(String[] args) {
		// min number
		List<Integer> list=Arrays.asList(10,20,30,50,10,20);

		Integer minValue=list.stream().min((a,b)->a -b).orElse(0);
		System.out.println("min value ::"+ minValue);
	}

}
