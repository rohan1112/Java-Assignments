//3) create a multi-threaded application by using Thread pool and ReentrantLock (explicit locking) .create 2 threads. each thread should display characters from A to J. [ make sure while one thread executes , other thread should not interfere ]
package Advanced_Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ass3 implements Runnable {
	ReentrantLock r = new ReentrantLock();

	public void run() {
		r.lock();
		disp();
		r.unlock();
	}

	void disp() {
		for (char ch = 'A'; ch <= 'J'; ch++) {
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		ExecutorService obj = Executors.newFixedThreadPool(2);
		ass3 a = new ass3();
		for (int i = 0; i < 2; i++) {
			obj.execute(a);
		}
		obj.shutdown();

	}

}
