package com.murli;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SotByLengthString {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("tushar","atul","tushar","rahul","diksha","rushab","ravindra","atul");
		Map<Integer, List<String>> result=str.stream().collect(Collectors.groupingBy(s->s.length()));
		System.out.println(result);

		
	}

}
