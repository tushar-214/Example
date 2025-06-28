package com.basics.Array;

public class MinValue {
	
	public static void main(String[] args) {
		
		int ar[] = {10,2,45,7,99,1};
		int min=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		System.out.println("min value  :: "+min);
	}

}
