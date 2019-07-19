/*
* Classname:    CompletableFutureReturn.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureReturn {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> ThreadLocalRandom.current().nextInt(1, 10));
        Integer integer = cf.join();
        System.out.println("" + integer);
        
        System.out.println("-------------------------------------------------");
        
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String> () {
            @Override
            public String get() {
                
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException ie) {
                    throw new IllegalStateException(ie);
                }
                return "Result of the asynchronous computation";
            }
        });
        String result = future.get();
        
        System.out.println("" + result);
        
        
        System.out.println("----------------------lambdas---------------------------");
        
        CompletableFuture<String> futureLambda = CompletableFuture.supplyAsync(() -> {
            try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException ie) {
                    throw new IllegalStateException(ie);
                }
                return "Result of the asynchronous computation";
        });
        
        String resultLambda = future.get();
        
        System.out.println("" + resultLambda);
    }
}
