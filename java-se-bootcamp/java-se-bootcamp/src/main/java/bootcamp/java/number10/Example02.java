/**
 * Class: Example02.java
 * Author: hector.hernandez
 * Date: Mar 7, 2020
 */
package bootcamp.java.number10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example02 {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy");
		
		Date now = new Date();
		
		System.out.println(simpleDateFormat.format(now));
	}
}
