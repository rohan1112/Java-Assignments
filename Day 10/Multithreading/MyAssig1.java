package Multithreading;

class printCharacters extends Thread{
	
	public void run() {
		int c=65;
		for(int i=c;i<75;i++) {
			System.out.println((char)c++);
		}
	}
}

public class MyAssig1 {
	public static void main(String[] args) {
		
		printCharacters p=new printCharacters();
		p.start();
	}
}
