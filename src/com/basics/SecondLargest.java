package com.basics;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,45,378,278,199);
		Optional sortred=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(sortred);
	}
	

}
