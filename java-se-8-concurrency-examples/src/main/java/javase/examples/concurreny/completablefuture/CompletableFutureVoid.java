/*
* Classname:    CompletableFutureVoid.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureVoid {
    public static void main(String[] args) {
        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            System.out.println("running, in thread: " + Thread.currentThread().getName());
        });
        cf.join();
        System.out.println("-------------------------------------------------");
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException ie) {
                throw new IllegalStateException(ie);
            }
            System.out.println("Separate thread tha the main therad");
        });
        future.join();
        System.out.println("main exiting, thread " + Thread.currentThread().getName());
    }
}
