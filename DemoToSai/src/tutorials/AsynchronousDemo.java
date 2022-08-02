package tutorials;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchronousDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println(Thread.currentThread().getName());
		
	runing();
	
	System.out.println("SomePrinting here");
	}
	
	
	public static void runing() throws InterruptedException, ExecutionException {
		
		Thread.sleep(2000);
		
		CompletableFuture<List<Integer>> asyncList=CompletableFuture.supplyAsync(()->{
			System.out.println(Thread.currentThread().getName());
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Arrays.asList(1,2,3,4);
		});
		System.out.println("Multithreading here");
		System.out.println(asyncList.get());
		
	}
	}
