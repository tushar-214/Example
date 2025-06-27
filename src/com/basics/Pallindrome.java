package com.basics;

import java.util.stream.IntStream;

public class Pallindrome {
	public static void main(String[] args) {
		String name = "1221";
		Boolean result = IntStream.range(0, name.length() / 2)
				.allMatch(i -> name.charAt(i) == name.charAt(name.length() - i - 1));
		if (result) {
			System.out.println("its pallindrome");
		} else {
			System.out.print("not pallindrome ");
		}
	}
}
