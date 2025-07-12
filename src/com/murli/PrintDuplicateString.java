package com.murli;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateString {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("tushar","atul","tushar","rahul","diksha","rushab","ravindra","atul");
		
		Set<String> sa=new HashSet<String>();
		List<String> duplicate =str.stream().filter(i-> !sa.add(i)).distinct().toList();
		System.out.println("duplicate String =  "+duplicate);

	}

}
