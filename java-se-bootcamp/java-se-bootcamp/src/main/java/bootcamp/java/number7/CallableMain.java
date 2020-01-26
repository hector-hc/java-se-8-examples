/**
 * Class: CallableMain.java
 * Author: hector.hernandez
 * Date: Jan 25, 2020
 */
package bootcamp.java.number7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class CallableMain {

	public static void main(String[] args) {
		System.out.println("hilo:" + Thread.currentThread().getName());
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int x = 1; x < 7; x++) {
			MyCallable myC1 = new MyCallable();
			Future<Double> result1 = executor.submit(myC1);
			try {
				System.out.println("result_" + x + "=" + result1.get());
			} catch (ExecutionException ee) {
				ee.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		executor.shutdown();
		
		
	}
}
