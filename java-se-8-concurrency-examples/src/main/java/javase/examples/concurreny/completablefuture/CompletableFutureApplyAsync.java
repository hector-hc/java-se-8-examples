/*
* Classname:    CompletableFutureApplyAsync.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureApplyAsync {
    public static void main(String[] args) {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(s -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ie) {
                throw new RuntimeException(ie);
            }
            return s.toUpperCase();
        });
        System.out.println("" + cf.getNow(null));
        System.out.println("" + cf.join());
    }
}
