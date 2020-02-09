/**
 * Class: Example03.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example03 {
	public static void main(String[] args) {
		UserCounter userCounter = new UserCounter();
		Thread thread01 = new Thread(userCounter);
		Thread thread02 = new Thread(userCounter);
		Thread thread03 = new Thread(userCounter);
		thread01.start();
		thread02.start();
		thread03.start();
	}
}
