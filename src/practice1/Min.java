package practice1;

import java.util.Arrays;
import java.util.List;

public class Min {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(102,4,55,22,11,1);
Integer minvalue=	list.stream().sorted().min((a,b) -> a-b).orElse(0);
System.out.println(minvalue);
}
}
