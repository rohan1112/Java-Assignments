//1) create a multi-threaded application by using Thread pool.create 2 threads. each thread should display characters from A to J. [ make sure while one thread executes , other thread should not interfere ]
package Advanced_Multithreading;

import java.util.concurrent.*;
public class ass1 implements Runnable{
	synchronized public void disp()
	{
		for (char ch='A';ch<='J';ch++)
		{
			System.out.println(ch);
		}
	}
	public void run()
	{
		disp();
	}

	public static void main(String[] args) {
		ExecutorService obj=Executors.newFixedThreadPool(2);
		ass1 a= new ass1();
		for (int i=0;i<2;i++)
		{
			obj.execute(a);
		//ystem.out.println(Thread.currentThread().getName());
		}
		obj.shutdown();

	}

}
