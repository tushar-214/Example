package com.basics.Array;

public class AvergeDemo {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 40, 4, 67, 1, 77 };
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = ar[i] + sum;
			

		}
		System.out.println("avg = "+sum/ar.length);

	}

}
