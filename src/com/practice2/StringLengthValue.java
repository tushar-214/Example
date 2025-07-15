package com.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthValue {
	public static void main(String[] args) {
		
		
		List<String> list=Arrays.asList("tushar","Vishal","ganesh","uma","uma","atha","jkjd");
	Map<Integer, List<String>>	map=list.stream().collect(Collectors.groupingBy(s ->s.length()));
	System.out.println(map);
		
	}

}
