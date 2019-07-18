/*
* Classname:    ZonedDateTimeTwoPlaces.java
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
public class ZonedDateTimeTwoPlaces {
    public static void main(String[] args) {
        ZonedDateTime zdtLocal = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Mexico_City"));
        System.out.println("zdtLocal: " + zdtLocal);
        ZonedDateTime zdtParis = zdtLocal.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("zdtParis: " + zdtParis);
        ZonedDateTime zdtLocalMx = zdtParis.withZoneSameInstant(ZoneId.of("America/Mexico_City"));
        System.out.println("zdtLocalMx: " + zdtLocalMx);
    }
}
