package com.murli;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountLength {
	public static void main(String[] args) {
		// count the element 
		
		List<String> str=Arrays.asList("tushar","atul","tushar","rahul","diksha","rushab","ravindra","atul");

		Map<String, Long> map=str.stream().collect(Collectors.groupingBy(s-> s, Collectors.counting()));
		System.out.println(map);
	}

}
