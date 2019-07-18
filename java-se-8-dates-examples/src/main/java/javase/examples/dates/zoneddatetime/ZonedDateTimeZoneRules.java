/*
* Classname:    ZonedDateTimeZoneRules.java
* Author:       Héctor Hernández Chávez
* Date:         18-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Héctor Hernández Chávez
 */
public class ZonedDateTimeZoneRules {
    public static void main(String args[]) {
        ZonedDateTime zTotalityZonedDateTime = ZonedDateTime.now();
        ZoneId mexicoCity = ZoneId.of("America/Mexico_City");
        System.out.println("isDaylightSavings: " + mexicoCity.getRules()
                .isDaylightSavings(zTotalityZonedDateTime.toInstant()));
    }
}
