/**
 * Class: Example10.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.concurrent.ThreadFactory;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example10 {

	public static void main(String[] args) {
		ThreadFactory threadFactory = new MaxPriorityThreadFactory();
		
		Thread t1 = threadFactory.newThread(new ARunnable());
		
		//System.out.println("The name of the thread is " + t1.getName());
		//System.out.println("The priority of the thread is " + t1.getPriority());
		t1.start();
		
		//Thread t2 = threadFactory.newThread(new ARunnable());
		//t2.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("i=" + i);
		}
		
		
		
		
		//System.out.println("The name of the thread is " + t2.getName());
		//System.out.println("The priority of the thread is " + t2.getPriority());
		
		
		//Thread t3 = threadFactory.newThread(new ARunnable());
		//t3.start();
		
		//threadFactory.newThread(new ARunnable()).start();
	}
}
