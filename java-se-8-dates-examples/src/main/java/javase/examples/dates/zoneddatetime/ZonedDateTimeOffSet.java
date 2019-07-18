/*
* Classname:    ZonedDateTimeOffSet.java
* Author:       Héctor Hernández Chávez
* Date:         18-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author Héctor Hernández Chávez
 */
public class ZonedDateTimeOffSet {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZonedDateTime zdtLocal = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Mexico_City"));
        ZoneId.getAvailableZoneIds().stream().sorted().map(ZoneId::of).forEach(zoneId -> {
            ZonedDateTime zdt = zdtLocal.withZoneSameInstant(zoneId);
            System.out.printf("%10s %25s %10s%n", zdt.getOffset(), zoneId, 
            zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
        });
    }
}
