package com.basics.practice;

import java.util.Arrays;
import java.util.List;

public class StringTransform {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("tushar","vishal","ganesh");
		list.stream().map(x -> x.toUpperCase()).forEach(System.out::print);
	}

}
