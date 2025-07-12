package com.murli;

import java.util.Arrays;
import java.util.List;

public class PrintRemoveDuplicate1 {
public static void main(String[] args) {
	List<String> str=Arrays.asList("tushar","atul","rahul","rushab","ravindra","atul");
	System.out.println("remove Duplicate ");
	str.stream().distinct().forEach(System.out::println);
	
}
}
