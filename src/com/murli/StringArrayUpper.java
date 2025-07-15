package com.murli;

import java.util.Arrays;
import java.util.List;

public class StringArrayUpper {
public static void main(String[] args) {
	System.out.println("make all upper case");
	List<String> str=Arrays.asList("tushar","atul","tushar","rahul","diksha","rushab","ravindra","atul");
	str.stream().map(s->s.toUpperCase()).forEach(System.out::println);

}
}
