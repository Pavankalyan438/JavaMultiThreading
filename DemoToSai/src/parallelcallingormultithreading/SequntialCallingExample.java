package parallelcallingormultithreading;

import java.util.Iterator;

public class SequntialCallingExample {
	public static void main(String[] args) throws InterruptedException {
		long start=System.currentTimeMillis();
Worker1 worker1=new Worker1();
Worker2 worker2=new Worker2();
worker1.executeTask1();
worker2.executeTask2();
System.out.println("Total time: "+(System.currentTimeMillis()-start  ));
	}
}

class Worker1 {

	void executeTask1() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Worker 1 executing the taks " + i);

		}
	}
}

class Worker2 {

	void executeTask2() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Worker 2 executing the taks " + i);

		}
	}
}