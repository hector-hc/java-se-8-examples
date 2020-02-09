/**
 * Class: Factorial.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.concurrent.Callable;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Factorial implements Callable<Long> {

	private long n;

	public Factorial(long n) {
		this.n = n;
	}

	@Override
	public Long call() throws Exception {
		if (n <= 0) {
			throw new Exception("for finding factorial, N should be > 0");
		}
		long fact = 1;
		for (long longVal = 1; longVal <= n; longVal++) {
			//fact = fact * longVal;
			fact *= longVal;
		}
		return fact;
	}
	
}
