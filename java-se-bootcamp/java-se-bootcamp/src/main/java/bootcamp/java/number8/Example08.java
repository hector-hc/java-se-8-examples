/**
 * Class: Example08.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example08 {
	public static void main(String[] args) {
		
		Runnable runnable = new Task();
		
		//System.out.println("Calling Task.run() by directly creating a Thread object");
		
		
		//Thread thread = new Thread(runnable);
		//thread.start();
		
		RepeatedExecutor executor = new RepeatedExecutor();
		executor.execute(runnable, 100);
	}
}
