package com.stringPr;

import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {

		String name = "programming";
		String removeDuplicate = name.chars().mapToObj((c) -> (char) c).distinct().map(c -> String.valueOf(c))
				.collect(Collectors.joining());	
		System.out.println(removeDuplicate);
	}

}
