/**
 * Class: Example01.java
 * Author: hector.hernandez
 * Date: Mar 7, 2020
 */
package bootcamp.java.number10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example01 {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		long start = System.currentTimeMillis();
		
		Date now = new Date();
		System.out.println("date: " + now);
		
		Calendar caledar = Calendar.getInstance();
		
		System.out.println("calendar: " + caledar.getTime());
		
		Calendar c = new GregorianCalendar(2020, 0, 1, 13, 59, 59);
		
		//System.out.println("year=" + c.get(Calendar.YEAR));
		//System.out.println("hour=" + c.get(Calendar.HOUR_OF_DAY));
		//System.out.println("minute=" + c.get(Calendar.MINUTE));
		//System.out.println("minute=" + c.get(Calendar.AM_PM));
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		//Date c01 = simpleDateFormat.parse("2020/03/06");
		
		//Date c02 = simpleDateFormat.parse("2020/03/06");
		
		
		//System.out.println("c01 before c02=" + c01.compareTo(c02));
		
		Date d = simpleDateFormat.parse("2020/07/06 11:59:59");
		System.out.println("d=" + d);
		
		GregorianCalendar cc = new GregorianCalendar();
		cc.setTime(d);
		System.out.println("año: " + cc.isLeapYear(d.getYear()));
		
		System.out.println("zt: " + cc.getTimeZone());
		
		Thread.sleep(500);
		
		long end = System.currentTimeMillis();
		
		
		
		
		
		System.out.println("diff:" + (end - start) + " ms");
	}
}
