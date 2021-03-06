/*
* Classname:    TimeDuration.java
* Author:       Héctor Hernández Chávez
* Date:         18-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Héctor Hernández Chávez
 */
public class TimeDuration {
    public static void main(String[] args) {
        LocalTime begins = LocalTime.of(12, 17, 32, 000);
        LocalTime totality = LocalTime.of(13, 35, 56, 999);
        
        
        System.out.println("Elipse begins at " + begins + " and totality is at " + totality);
        long betweenMins = ChronoUnit.MINUTES.between(begins, totality);
        System.out.println("Minutes between begin and totality: " + betweenMins);
        
        long betweenSeconds = ChronoUnit.SECONDS.between(begins, totality);
        System.out.println("Seconds between begin and totality: " + betweenSeconds);
        
        long betweenMilli = ChronoUnit.NANOS.between(begins, totality);
        System.out.println("Milli between begin and totality: " + betweenSeconds);
        
        Duration betweenDurationMin = Duration.ofMinutes(betweenMins);
        
        Duration betweenDurationSec = Duration.ofSeconds(betweenSeconds);
        
        Duration betweenDurationMilli = Duration.ofNanos(betweenMilli);
        
        System.out.println("Duration Min " + betweenDurationMin);
        System.out.println("Duration Sec " + betweenDurationSec);
        System.out.println("Duration Milli " + betweenDurationMilli);
        
        /*LocalTime totalityBegins = begins.plus(betweenDurationSec);
        System.out.println("Totality begins, computed: " + totalityBegins);*/
    }
}
