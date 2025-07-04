package com.basics.practice;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(10,203,455,345,321,1);
	int max=list.stream().sorted().max(Integer::compare).orElse(0);
	System.out.println(max);
}
}
