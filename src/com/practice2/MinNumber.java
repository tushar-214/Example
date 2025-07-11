package com.practice2;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
	public static void main(String[] args) {
		System.out.println("minimum number from arrayList ");
		
    List<Integer> list=Arrays.asList(10,20,40,60,2,4,7,1);
	Integer	list1=list.stream().min((a,b)-> a-b).orElse(0);
	System.out.println(list1);
		
	}

}
