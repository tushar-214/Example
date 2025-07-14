package com.murli;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeSorting {
	public static void main(String[] args) {
		Employee emp = new Employee(3, "tushar", 39403);
		Employee emp1 = new Employee(1, "nana", 9403);
		Employee emp2 = new Employee(4, "akshay", 81403);
		Employee emp3 = new Employee(2, "sonya", 13403);

		List<Employee> list = Arrays.asList(emp, emp1, emp2, emp3);

		System.out.println("-------------------------------------------------");
		System.out.println("sort by id ");

		
		List<Employee> empList = list.stream().sorted(Comparator.comparing(e -> e.getId())).toList();
		for (Employee e : empList) {
			System.out.println("  " + e.getId() + "  " + e.getName() + "  " + e.getSalaryl());
		}

		
		System.out.println("-------sort By Name  ------------------------------------------");
		list.stream().sorted(Comparator.comparing(e -> e.getName()))
				.forEach(i -> System.out.println(i.getId() + "  " + i.getName() + "  " + i.getSalaryl()));

		
		System.out.println("-------salary is greater than 30000 ------------------------------------------");

		list.stream().filter(i -> i.getSalaryl() > 30000)
				.forEach(i -> System.out.println(i.getId() + "  " + i.getName() + "  " + i.getSalaryl()));

	}

}
