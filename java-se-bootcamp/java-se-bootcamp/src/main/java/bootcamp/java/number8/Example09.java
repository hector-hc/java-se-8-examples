/**
 * Class: Example09.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example09 {

	public static void main(String[] args) throws Exception {
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		long N = 10;
		
		Callable<Long> task = new Factorial(N);
		
		Future<Long> future = es.submit(task);
		
		System.out.printf("factorial of %d is %d", N, future.get());
		
		es.shutdown();
		
	}
}
