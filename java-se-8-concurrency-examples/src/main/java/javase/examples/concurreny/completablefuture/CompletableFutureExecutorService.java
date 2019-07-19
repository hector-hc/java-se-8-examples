/*
* Classname:    CompletableFutureExecutorService.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureExecutorService {
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletableFuture.runAsync(() -> performTask("first stage"), executor)
                .thenRun(() -> performTask("second stage")).thenRunAsync(() -> 
                        performTask("third stage"), executor).join();
        System.out.println("mian existing");
        executor.shutdown();
    }

    private static void performTask(String stage) {
        System.out.println("-----------");
        System.out.printf("stage: %s, time before task: %s, thread: %s%n", stage, LocalTime.now(), Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.printf("stage: %s, time afetr task: %s, thread: %s%n", stage, LocalTime.now(), Thread.currentThread().getName());
    }
}
