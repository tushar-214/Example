package com.practice2;

import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		String s1 = "Sjfd";
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply(s1));
	}
}
