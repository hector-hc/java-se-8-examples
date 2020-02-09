/**
 * Class: Example18.java
 * Author: hector.hernandez
 * Date: Feb 8, 2020
 */
package bootcamp.java.number8;

import java.util.Arrays;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example18 {
	public static void main(String[] args) {
		String[] strArr = { "21", "1", "111", "12", "123" };
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		int[] intArr = { 21, 1, 111, 12, 123 };
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		
	}
}
