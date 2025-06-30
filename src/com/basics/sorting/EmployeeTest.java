package com.basics.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "tushar", 23443.0);
		Employee emp1 = new Employee(6, "akshay", 20443.0);
		Employee emp2 = new Employee(2, "ganesh", 12672.0);
		Employee emp3 = new Employee(4, "vishal", 83443.0);
		List<Employee> list=Arrays.asList(emp,emp1,emp2,emp3);
		Collections.sort(list);
		
		
		System.out.println(list);
	}

}
