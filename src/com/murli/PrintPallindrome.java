package com.murli;

import java.util.Arrays;
import java.util.List;

public class PrintPallindrome {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("madam", "ama", "rahul", "diksha", "rushab", "ravindra", "adda");
	str.stream().filter(i->i.equalsIgnoreCase(new StringBuffer(i).reverse().toString())).forEach(System.out::println);

	}
}
