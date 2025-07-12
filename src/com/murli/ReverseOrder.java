package com.murli;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseOrder {
	public static void main(String[] args) {
		System.out.println("reverse string ");
		List<String> str=Arrays.asList("tushar","atul","rahul","diksha","rushab","ravindra");
		IntStream.range(0, str.size()).mapToObj(i->str.get(str.size()-i-1)).forEach(i->System.out.print(" "+i));

	}

}
