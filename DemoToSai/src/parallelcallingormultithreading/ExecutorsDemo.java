package parallelcallingormultithreading;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {	
		long start=System.currentTimeMillis();
		Runnable runnable=()->{
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Runnable 1 is :" +Thread.currentThread().getName());
		};
Runnable runnable1=()->{
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Runnable 2 :" +Thread.currentThread().getName());
		};
Runnable runnable3=()->{
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Runnable 3 :" +Thread.currentThread().getName());
		};
		
		List<Runnable> runnables=Arrays.asList(runnable,runnable1,runnable3);
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		
		runnables.forEach(runn->{
			System.out.println("THRESD NAME:"+Thread.currentThread().getName());
			Future<String> a=service.submit(runn,"DONE");
			System.out.println("SUBMITTED");
			
		});
		
		
		
		service.shutdown();
		if(service.isShutdown())
		System.out.println("Total time: "+(System.currentTimeMillis()-start));

	}

}
