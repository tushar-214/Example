package com.practice2;

import java.util.Arrays;
import java.util.List;

public class MaxFind {
	
	public static void main(String[] args) {
		System.out.println("Maximum number from ");
		List<Integer> list=Arrays.asList(10,20,30,405,9,334);
		Integer maxnum=list.stream().max((a,b) -> a - b).orElse(0);
		System.out.println("Maximum Number :: "+maxnum);
		
	}
}
