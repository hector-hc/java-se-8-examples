/*
* Classname:    CompletableFutureDone.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureDone {

    public static void main(String[] args) {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
        System.out.println("" + cf.isDone());
        System.out.println("result: " + cf.getNow(null));
    }
}
