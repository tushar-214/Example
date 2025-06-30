package com.basics.sorting;

import java.util.Comparator;

public class StudentSortByName implements Comparator<Student> {
@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.getName().compareToIgnoreCase(o2.getName());
}
}
