package com.murli;

import java.util.Arrays;
import java.util.List;

public class SumOfNumber {
	public static void main(String[] args) {
		
		System.out.println("sum of number ::");
		List<Integer> list=Arrays.asList(10,20,30,50,10,20);
		Integer sum=list.stream().reduce(0,(a,b)->a+b);
		System.out.println("sum = "+sum);
	}

}
