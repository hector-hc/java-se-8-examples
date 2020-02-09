/**
 * Class: Example19.java
 * Author: hector.hernandez
 * Date: Feb 8, 2020
 */
package bootcamp.java.number8;

import java.util.Arrays;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example19 {
	public static void  main(String []args) {
        String [] strArr = { "21", "22", "11", "12", "13" };
        System.out.println("The given strArr is: " + Arrays.toString(strArr));
        
        
        Arrays.sort(strArr);
        
        System.out.println("*** The given strArr is: " + Arrays.toString(strArr));
        
        int index = Arrays.binarySearch(strArr, "21");
        System.out.println("The index value is: " + index);
	}
}
