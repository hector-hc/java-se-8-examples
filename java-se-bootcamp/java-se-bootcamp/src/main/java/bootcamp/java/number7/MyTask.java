/**
 * Class: MyTask.java
 * Author: hector.hernandez
 * Date: Jan 25, 2020
 */
package bootcamp.java.number7;

import java.util.concurrent.TimeUnit;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class MyTask implements Runnable {
	public void run() {
		try {
			System.out.println("procesando.....");
			TimeUnit.SECONDS.sleep(8);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
