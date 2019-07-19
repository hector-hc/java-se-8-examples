/*
* Classname:    CompletableFutureHandleExceptions.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureHandleExceptions {
    public static void main(String[] args) {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(String::toUpperCase);
        CompletableFuture<String> exceptionHandler = cf.handle((s, th) -> {return (th != null ? "message upon cancel" : "");});
        cf.completeExceptionally(new RuntimeException("compled exceptionally"));
        cf.join();
        exceptionHandler.join();
    }
}
