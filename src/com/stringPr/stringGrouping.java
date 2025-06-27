package com.stringPr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class stringGrouping {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("tushar", "ganesh", "vishal", "tushar", "abc", "xyz", "hi");
		Map<Integer, List<String>> slits = list.stream().collect(Collectors.groupingBy(s -> s.length()));
		//System.out.println(slits);
		slits.forEach((key,value)-> System.out.println("  "+key +"  :  "+ "   "+value));

	}
}
