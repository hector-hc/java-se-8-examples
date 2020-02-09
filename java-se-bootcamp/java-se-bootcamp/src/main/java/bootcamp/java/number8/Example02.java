/**
 * Class: Example02.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example02 {

	public static void main(String[] args) {
		Thread timer = new Thread(new TimeBomb());
		System.out.println("Starting 10 second count down... ");
		timer.start();
		try {
			timer.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Boom!!!");
	}
}
