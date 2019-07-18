/*
* Classname:    ZonedDateTimeLeapYear.java
* Author:       Héctor Hernández Chávez
* Date:         18-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Héctor Hernández Chávez
 */
public class ZonedDateTimeLeapYear {

    public static void main(String[] args) {
        ZonedDateTime zdtLocal = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Mexico_City"));
        System.out.println("is 2024 a leap year? " + zdtLocal.toLocalDate().isLeapYear());
    }
}
