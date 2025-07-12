package com.murli;

import java.util.Arrays;
import java.util.List;

public class StringListOrder {
	public static void main(String[] args) {
		System.out.println("sorted order string ");
		List<String> str=Arrays.asList("tushar","atul","rahul","diksha","rushab","ravindra","atul");
		str.stream().sorted().distinct().forEach(i->System.out.print("  "+i));

	}

}
