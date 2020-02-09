/**
 * Class: UserCounterAtomicInteger.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class UserCounterAtomicInteger implements Runnable {
	
	@Override
	public void run() {
		increment();
		increment();
		increment();
	}
	
	public void increment() {
		int i = CounterAtomicInteger.atomicInteger.getAndIncrement();
		
		
		synchronized (this) {
			System.out.print(" " + i);
		}
		
	}
}
