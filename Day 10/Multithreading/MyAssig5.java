package Multithreading;

class MyThread implements Runnable{
	
	public void run() {
		if(Thread.currentThread().getName().equals("first")) {
			for(int i=1;i<=50;i++) {
				System.out.println(i);
			}
		}
		else {
			
		for(int i=50;i>0;i--) {
			System.out.println(i);
		}
		}
	}
}
public class MyAssig5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("first");
		t1.start();
		t2.start();
		

	}

}
