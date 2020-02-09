/**
 * Class: AtomicIntegerIncrement.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class AtomicIntegerIncrementer extends Thread {

	private static AtomicInteger atomicInteger = new AtomicInteger(0);
	
	@Override
	public void run() {
		System.out.println("************************* Incremented value of atomic integer is: "
                + atomicInteger.incrementAndGet());
	}

}
