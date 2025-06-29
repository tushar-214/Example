package com.basics.Array;

public class ReverseArray {
public static void main(String[] args) {
	int ar[] = {10,20,30,40,60};
	
	System.out.println("reverse array ");
	
	for(int i=0,j=ar.length-1;i<j;i++,j--)
	{
		
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		
	}
	
	
	for (int i : ar) {
		
		System.out.print("   " + i);
	}
}
}
