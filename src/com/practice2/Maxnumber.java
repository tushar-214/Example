package com.practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Maxnumber {
	public static void main(String[] args) {
		System.out.println("Max number from the list");
		List<Integer> list=Arrays.asList(10,20,30,565,1,3,5);
	Integer	maxnum=list.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
	System.out.println("Maximum number of the given List "+maxnum);
		
	}

}
