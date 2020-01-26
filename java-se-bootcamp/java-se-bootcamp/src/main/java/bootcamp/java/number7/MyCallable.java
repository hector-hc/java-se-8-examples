/**
 * Class: MyCallable.java
 * Author: hector.hernandez
 * Date: Jan 25, 2020
 */
package bootcamp.java.number7;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class MyCallable implements Callable<Double> {

	public Double call() {
		try {
			System.out.println("Nombre de hilo: " + Thread.currentThread().getName());
			System.out.println("procesando...");
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		return 12.34;
	}
}
