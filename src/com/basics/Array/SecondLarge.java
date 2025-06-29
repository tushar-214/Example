package com.basics.Array;

public class SecondLarge {
	public static void main(String[] args) {
		int ar[]= {10,30,1,44,6,89};
		
		int large=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[i]>large)
			{
				second=large;
				large=ar[i];
				
			}else if(ar[i]>second && ar[i]<large)
			{
				second=ar[i];
				
			}
			
		}
		
		System.out.println("Largest number is "+large);
		System.out.println("Second Largest number is "+second);
	}

}
