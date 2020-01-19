/**
 * Class: Thread01.java;
 * Author: hector.hernandez
 * Date: Jan 18, 2020
 */
package bootcamp.java.number7;

import java.util.concurrent.TimeUnit;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Thread01 {
	public static void main(String[] args) {
		System.out.println("Hola");
		System.out.println("nombre de hilo: " + Thread.currentThread().getName());
		
		
		//ThreadExample thread = new ThreadExample();
		//thread.start();
		
		//MyRunnable mr = new MyRunnable();
		
		/*Thread r = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				System.out.println("Termino el proceso: " + Thread.currentThread().getName());
				
			}
		});
		r.start();*/
		

		
		
		Thread t = new Thread(() -> {
			try {
				//Thread.sleep(5000);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Estado: " + Thread.currentThread().getState());
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Termino el proceso: " + Thread.currentThread().getName());
		});
		//t.setPriority(9);
		
		
		t.start();
		
		
		/*new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Termino el proceso: " + Thread.currentThread().getName());
		}).start();*/
		
		System.out.println("fin");
		
		
		//ThreadExample thread1 = new ThreadExample();
		//thread1.start();
		
		
		//Car car = new Car();
		User user = new User(() -> {
			
		});
		System.out.println("OK");
	}
}
