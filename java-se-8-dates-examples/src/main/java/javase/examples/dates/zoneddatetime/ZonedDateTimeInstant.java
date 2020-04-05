/*
* Classname:    ZonedDateTimeInstant.java
* Author:       Héctor Hernández Chávez
* Date:         18-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Héctor Hernández Chávez
 */
public class ZonedDateTimeInstant {
    public static void main(String[] args) {
        ZonedDateTime totalityMexico = ZonedDateTime.of(2024, 4, 8, 13, 35, 56, 0, ZoneId.of("America/Mexico_City"));
        
        //Instant totalityInstant = totalityMexico.toInstant();
        System.out.println("ZonedDateTime:\t" + totalityMexico);
       // System.out.println("Instant:\t" + totalityInstant);
        
        
        //Instant nowInstant = Instant.now();
        //System.out.println("nowInstant:\t" + nowInstant);
        //long minsBetween = ChronoUnit.MINUTES.between(nowInstant, totalityMexico);
        /*Duration durationBetweenInstants = Duration.ofMinutes(minsBetween);
        System.out.println("Minutes between: " + minsBetween + ", is duration " + durationBetweenInstants);
        System.out.println("Seconds sinde epoch: " + nowInstant.getEpochSecond());*/
        
        System.out.println("DateTime of 3 day reminder: " + totalityMexico.plus(Period.ofDays(3)));
        System.out.println("DateTime of 3 day reminder: " + totalityMexico.minus(Period.ofDays(3)).getDayOfWeek());
        
    }
}
