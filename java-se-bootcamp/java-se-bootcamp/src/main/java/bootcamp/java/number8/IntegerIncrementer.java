/**
 * Class: IntegerIncrement.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class IntegerIncrementer extends Thread {

	private static Integer integer = new Integer(0);
	
	@Override
	public void run() {
		System.out.println("Incremented value of integer is: " + ++integer);
	}

}
