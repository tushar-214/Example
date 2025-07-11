package com.practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderList {
public static void main(String[] args) {
	System.out.println("Reverse Order Data ");
	List<Integer> list=Arrays.asList(10,20,30,40,50,60);
	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
}
}
