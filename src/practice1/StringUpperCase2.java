package practice1;

import java.util.Arrays;
import java.util.List;

public class StringUpperCase2 {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("Tushar","ganesh","vishal");
		list.stream().map(x->x.toUpperCase()).forEach(System.out::println);
	}

}
