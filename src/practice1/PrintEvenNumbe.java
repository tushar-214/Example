package practice1;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbe {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(10,23,4,56,7,22,1);
		list.stream().filter((x)-> x%2==0).forEach(System.out::println);
	}

}
