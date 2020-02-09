/**
 * Class: Example05.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example05 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread01 = new Thread(new TimeBomb());
		thread01.start();
		
		Thread.currentThread().sleep(13000);
		
		//thread01.start();
		
		Thread thread02 = new Thread(new TimeBomb());
		thread02.start();
	}
}
