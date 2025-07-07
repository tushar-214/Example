package com.basics.multithreading;

public class RunDEmo implements Runnable{
	@Override
	public void run() {
		m1();
		// TODO Auto-generated method stub
		
	}
	
	
	void m1()
	{
		System.out.println("hello Runnable demo ");
		
		for(int i=0;i<=5;i++)
		{
			
			System.out.println("demo"+i);
			
			try {
				
				Thread.sleep(1000);
				
			}catch (Exception e) {
				System.out.println(e);// TODO: handle exception
			}
		}
		
	}

}
