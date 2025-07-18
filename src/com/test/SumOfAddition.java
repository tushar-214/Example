package com.test;

public class SumOfAddition {
System.out.print("hiiii"):

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .reduce(0, (a, b) -> a + b);
System.out.println(sum); // Output: 15

  
}
