package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringWordsCount {
public static void main(String[] args) {
	List<String> list =Arrays.asList("tushar","ganu","pranav","ganu");
	Map<Integer, Long> word =list.stream().collect(Collectors.groupingBy(w -> w.Collectors.counting()));
			
}
}
