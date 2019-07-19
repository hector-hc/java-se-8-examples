/*
* Classname:    CompletableFutureAcceptThenRun.java
* Author:       Héctor Hernández Chávez
* Date:         19-jul-2019
*/
package javase.examples.concurreny.completablefuture;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

/**
 * @author Héctor Hernández Chávez
 */
public class CompletableFutureAcceptThenRun {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            try {
                StringBuilder sb = new StringBuilder();
                URL url = new URL("http://localhost:4848/common/index.jsf");
                try (BufferedInputStream bis = new BufferedInputStream(url.openStream())) {
                    int ch;
                    while ((ch = bis.read()) != -1) {
                        sb.append((char) ch);
                    }
                }
                return sb.toString();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).thenAccept(System.out::println).thenRun(() -> System.out.println("Task finished")).join();
    }
}
