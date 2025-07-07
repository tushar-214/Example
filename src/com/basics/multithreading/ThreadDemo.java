package com.basics.multithreading;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		greetDemo();
		
	}
	
	void greetDemo()
	{
		
		System.out.println("Helloo tushar Good Morning ");
		
		for(int i=0;i<=5;i++)
		{
			
			System.out.println("Thread 1 "+i);
			try {
                Thread.sleep(1000); // Correct usage with long (1000 ms = 1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
		
	}

}
