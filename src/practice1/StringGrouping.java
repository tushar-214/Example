package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringGrouping {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("Tushar1","ganesh","vishal","blob","slot","gold");
		Map<Integer, List<String>> grp=list.stream().collect(Collectors.groupingBy(x ->x.length()));
		System.out.println(grp);
	}

}
