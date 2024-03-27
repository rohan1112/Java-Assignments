package Multithreading;


class printCharacters2 implements Runnable{
	
	synchronized public void run() {
		for(int i=0;i<6;i++) {
			
			System.out.println("Exec "+ i);
		}
	}
}

public class MyAssig3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharacters2 p=new printCharacters2();
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
