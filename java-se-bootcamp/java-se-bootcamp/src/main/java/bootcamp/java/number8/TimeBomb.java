/**
 * Class: TimeBomb.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import static java.lang.Thread.*;
import static java.util.concurrent.TimeUnit.*;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class TimeBomb implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("" + i);
			try {
				//sleep(1000);
				//Thread.currentThread().sleep(2000);
				SECONDS.sleep(1);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
		
	}

}
