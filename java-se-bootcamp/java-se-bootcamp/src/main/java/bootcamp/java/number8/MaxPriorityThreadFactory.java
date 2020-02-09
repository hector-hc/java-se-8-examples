/**
 * Class: MaxPriorityTheadFactory.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.concurrent.ThreadFactory;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class MaxPriorityThreadFactory implements ThreadFactory {
	
	private static long count = 0;

	@Override
	public Thread newThread(Runnable r) {
		
		Thread temp = new Thread(r);
		temp.setName("prioritythread" + count++);
		temp.setPriority(Thread.MAX_PRIORITY);
		return temp;
	}

}
