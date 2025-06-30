package com.basics.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTest {
public static void main(String[] args) {
	
	Student emp = new Student(1, "tushar", 10);
	Student emp1 = new Student(6, "akshay", 4);
	Student emp2 = new Student(2, "ganesh", 7);
	Student emp3 = new Student(4, "vishal", 1);
	
	List<Student> list=Arrays.asList(emp,emp1,emp2,emp3);
	//Collections.sort(list,new StudentSortById());
	Collections.sort(list,new StudentSortByName());
	
	System.out.println(list);
}

}
