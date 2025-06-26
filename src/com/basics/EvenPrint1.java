package com.basics;

import java.util.Arrays;
import java.util.List;

public class EvenPrint1 {
public static void main(String[] args) {
	int[] ar= {10,2,45,9,17};
	List<Integer> list=Arrays.stream(ar).boxed().filter(a -> a%2==0).toList();
	System.out.println(list);
}
}
