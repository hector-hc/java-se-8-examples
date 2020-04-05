/*
* Classname:    DateTimeAdjustments.java
* Author:       Héctor Hernández Chávez
* Date:         18-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Héctor Hernández Chávez
 */
public class DateTimeAdjustments {
    
    // see OffsetDateTime
    
    public static void main(String[] args) {
        String eclipseDateTime = "2020-03-07 10:19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter);
        
        
        System.out.println("Eclipse day: " + eclipseDay);
        ZonedDateTime zTotalityDateTime = ZonedDateTime.of(eclipseDay, ZoneId.of("America/Mexico_City"));
        System.out.println("Date and time totality begins with time zone: " + zTotalityDateTime);
        ZonedDateTime followingThursdayDateTime = zTotalityDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("Thursday following the totality: " + followingThursdayDateTime);
    }
}
