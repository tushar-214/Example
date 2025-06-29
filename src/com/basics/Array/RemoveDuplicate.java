package com.basics.Array;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	Integer arr[] = { 10, 2, 23, 1, 10, 3, 12 };
	 List<Integer> uniqueList = new ArrayList<>();
     for (int i = 0; i < arr.length; i++) {
         if (!uniqueList.contains(arr[i])) {
             uniqueList.add(arr[i]);
         }
     }
     System.out.println("Unique elements:");
     for (int num : uniqueList) {
         System.out.print(num + " ");
     }
}
}
