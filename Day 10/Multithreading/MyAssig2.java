package Multithreading;

class printCharacters1 implements Runnable{
	
	public void run() {
		for(char i='A';i<='J';i++) {
			System.out.println(i);
		}
	}
}

public class MyAssig2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharacters1 p=new printCharacters1();
		Thread t1=new Thread(p);
		t1.start();
	}
}
