package Multithreading;

class MyThread1 implements Runnable{
	public static void disp(){
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
	}
	
	synchronized public void run() {
		disp();
	}
	
}

public class MyAssig4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 m1=new MyThread1();
		Thread th1=new Thread(m1);
		Thread th2=new Thread(m1);
		th1.start();
		th2.start();

	}

}
