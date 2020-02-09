/**
 * Class: Example06.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example06 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			new IntegerIncrementer().start();
			new AtomicIntegerIncrementer().start();
		}
	}
}
