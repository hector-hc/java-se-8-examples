/*
* Classname:    ZonedDateTimePeriod.java
* Author:       Héctor Hernández Chávez
* Date:         18-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Héctor Hernández Chávez
 */
public class ZonedDateTimePeriod {

    public static void main(String[] args) {
        ZonedDateTime totalityMexico = ZonedDateTime.of(2024, 4, 8, 13, 35, 56, 0, 
                ZoneId.of("America/Mexico_City"));
        System.out.println("Next total eclipse in Mexico, date/time in Mexico City:  " + totalityMexico);
        
        //Remider for a month before
        Period period = Period.ofMonths(1);
        System.out.println("Period is: " + period);
        ZonedDateTime reminder = totalityMexico.minus(period);
        System.out.println("DateTime of 1 month remider: " + reminder);
        System.out.println("Local DateTime of reminder: " + reminder.toLocalDateTime());
        System.out.println("Zoned DateTime (Madras, OR) of reminder: " + reminder.withZoneSameInstant(ZoneId.of("US/Pacific")));
    }
}
