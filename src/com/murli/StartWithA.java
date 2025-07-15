package com.murli;

import java.util.Arrays;
import java.util.List;

public class StartWithA {
	public static void main(String[] args) {
		List<String> str=Arrays.asList("tushar","atul","tushar","rahul","diksha","rushab","ravindra","atul");
		str.stream().filter(i->i.startsWith("d")).forEach(i->System.out.println(" "+i));

	}

}
