package com.basics.Array;
public class MaxNumber {
	public static void main(String[] args) {
	
		int ar[]= {10,20,44,323,5,1};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
				
			}
			
		}
		
		System.out.println("Max Value is   :: "+max);
		
	}

}
