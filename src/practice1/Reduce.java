package practice1;

import java.util.Arrays;
import java.util.List;

public class Reduce {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(19,24,57,55);
	Integer sum=	list.stream().reduce(0,(a,b)->a+b);
	System.out.println(sum);
	}

}
