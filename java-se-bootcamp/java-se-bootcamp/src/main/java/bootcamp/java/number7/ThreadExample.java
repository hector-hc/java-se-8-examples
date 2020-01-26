/**
 * Class: ThreadExample.java
 * Author: hector.hernandez
 * Date: Jan 18, 2020
 */
package bootcamp.java.number7;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class ThreadExample extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("HiloQueCalculaAlgo");
		System.out.println("Estado del hilo" + Thread.currentThread().getState());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Nombre del segundo hilo: " + Thread.currentThread().getName());
	}
}
