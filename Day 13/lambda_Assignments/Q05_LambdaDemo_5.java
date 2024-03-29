//5) define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
//
//create an implementation of "Runnable" using lambda expression which will invoke "disp()" method of "Display" class.
//
//create 2 threads and pass above created "Runnable" implementation to these threads.
//make sure while one thread is executing other thread will not interfere.

package lambda_Assignments;

class Display{
	synchronized void disp() {
		for(int i=1;i<6;i++) {
			System.out.println(i);
		}
	}
}



public class Q05_LambdaDemo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Implementation of Runnable using Lambda Expression
		Runnable run1=()->{
			Display d=new Display();
			d.disp();
		};
		
		Thread th1=new Thread(run1);
		th1.start();
		
		//For printing stars after thread 1 executes its task
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("*****************************");
		
		//Passing Runnable implementation as a parameter to Thread class constructor
		Thread th2=new Thread(()->{
			Display d=new Display();
			d.disp();
		});
		
		th2.start();
	}

}
