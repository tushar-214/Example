package com.practice2;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,1,3,45,4);
		List<Integer> li=list.stream().distinct().map(a-> a*a).toList();
		System.out.println(li);
	}

}
