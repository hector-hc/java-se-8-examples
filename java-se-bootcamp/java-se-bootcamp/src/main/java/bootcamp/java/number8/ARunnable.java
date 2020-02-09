/**
 * Class: ARunnable.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.concurrent.TimeUnit;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class ARunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Running the created thread START");
		
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("Running the created thread END");
	}

}
