/*
* Classname:    ZonedDateTimeList.java
* Author:       Héctor Hernández Chávez
* Date:         17-jul-2019
*/
package javase.examples.dates.zoneddatetime;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author Héctor Hernández Chávez
 */
public class ZonedDateTimeList {
    public static void main(String[] args) {
        Set<String> zonedIds = ZoneId.getAvailableZoneIds();
        
        List<String> zoneList = new ArrayList<>(zonedIds);
        Collections.sort(zoneList);
        for (String z : zoneList) {
        	System.out.println(z);
        }

        System.out.println("-------------------");
        zonedIds.stream().sorted().forEach(System.out::println);
    }
}
