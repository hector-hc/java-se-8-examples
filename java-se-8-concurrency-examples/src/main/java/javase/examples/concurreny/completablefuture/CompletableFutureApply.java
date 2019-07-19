/*
* Classname:    CompletableFutureApply.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureApply {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> ThreadLocalRandom.current().nextInt(1, 6))
                .thenApply(Math::sqrt).thenAccept(System.out::println).join();
        System.out.println("------------------------------------------------");
        CompletableFuture.completedFuture("message")
                .thenApply(String::toUpperCase).thenAccept(System.out::println);
    }
}
