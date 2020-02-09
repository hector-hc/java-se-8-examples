/**
 * Class: RepeatedExecutor.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.concurrent.Executor;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class RepeatedExecutor implements Executor {

	public void execute(Runnable runnable, int times) {
		System.out.printf("Calling Task.run() thro' Executor.execute() for %d times %n", times);
		for (int i = 0; i < times; i++) {
			execute(runnable);
		}
	}

	@Override
	public void execute(Runnable runnable) {
		new Thread(runnable).start();
	}
}
