/*
* Classname:    ZonedDateTimeCreate.java
* Author:       Héctor Hernández Chávez
* Date:         17-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Héctor Hernández Chávez
 */
public class ZonedDateTimeCreate {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        ZonedDateTime zTotalityDateTimeUsPacific = ZonedDateTime.of(nowDateTime, ZoneId.of("US/Pacific"));
        ZonedDateTime zTotalityDateTimeLocal = ZonedDateTime.now();
        System.out.println("zTotalityDateTimeUsPacific:\t" + zTotalityDateTimeUsPacific);
        System.out.println("zTotalityDateTimeLocal:\t\t" + zTotalityDateTimeLocal);
    }
}
