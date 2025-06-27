package com.stringPr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RemoveDuplicateStringArray {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("tushar","ganesh","vishal","tushar");
		List<String> reversedList= list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println(reversedList);
	}

}
