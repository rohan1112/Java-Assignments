//2) create a multi-threaded application by using Thread pool.create 2 threads. each thread should display numbers from 1 to 10. [ make sure while one thread executes , other thread should not interfere ]
//Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to display nos. from 1 to 5 and then previous thread will display nos. from 6 to 10 and so on.
package Advanced_Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ass2 implements Runnable
{
	synchronized public void run()
	{
		
		
			for(int i=0;i<10;i++)
			{  if(i==6)
				{try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			System.out.println(i);
			notify();

			}
		
		
	}

	public static void main(String[] args) 
	{
		ExecutorService obj=Executors.newFixedThreadPool(2);
		ass2 a=new ass2();
		for(int i=0;i<2;i++)
		{
			obj.execute(a);
		}
		obj.shutdown();
		

	}

}
