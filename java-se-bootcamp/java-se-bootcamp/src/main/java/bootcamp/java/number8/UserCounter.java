/**
 * Class: UserCounter.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class UserCounter implements Runnable {

	@Override
	public void run() {
		increment();
		increment();
		increment();
	}
	
	public /*synchronized*/ void increment() {
		synchronized (this) {
			Counter.count++;
			System.out.print(Counter.count + " ");
		}
		
		//System.out.println();
	}

}
