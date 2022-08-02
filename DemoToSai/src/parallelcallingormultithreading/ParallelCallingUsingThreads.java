package parallelcallingormultithreading;

public class ParallelCallingUsingThreads {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Worker11 worker1 = new Worker11();
		Worker21 worker2 = new Worker21();
		worker1.start();
		worker2.start();
		System.out.println("Total time: "+(System.currentTimeMillis()-start  ));
	}
	

}

class Worker11 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Worker 1 executing the taks " + i);

		}

	}

}

class Worker21 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Worker 2 executing the taks " + i);

		}

	}

}
