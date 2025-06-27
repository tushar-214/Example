package com.stringPr;

import java.util.Arrays;
import java.util.List;

public class CollectStringBasedOnLength {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("tushar", "ganesh", "vishal", "tushar", "abc", "xyz");
		List<String> newList = list.stream().filter(i -> i.length() == 3).toList();
		System.out.println(newList);

	}
}
