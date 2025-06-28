package com.basics.Array;

public class SortArray {
	public static void main(String[] args) {
		int ar[]= {10,20,40,4,67,1,77};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;		
				}
				
			}
		}
		
		System.out.println("sorted value ");
		for (int m : ar) {
			System.out.println(m);
	
		
	
		}
	
	
		
	}



	
}
