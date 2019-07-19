/*
* Classname:    CompletableStageThenRun.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completionStage;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableStageThenRun {
    
    public static void main(String[] args) {
        CompletionStage<Void> cf = CompletableFuture.runAsync(() -> performTask("first stage"));
        cf = cf.thenRun(() -> performTask("second stage"));
        cf = cf.thenRunAsync(() -> performTask("third stage"));
        ((CompletableFuture) cf).join();
        System.out.println("main existing");
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
