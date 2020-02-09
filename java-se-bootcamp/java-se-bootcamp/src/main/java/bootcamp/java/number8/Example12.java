/**
 * Class: Example12.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example12 {
	public static void main(String[] args) {
		/*ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++)
			nums.add(i);
		System.out.println("Original list " + nums);
		Iterator<Integer> numsIter = nums.iterator();
		while (numsIter.hasNext()) {
			numsIter.next();
			numsIter.remove();
		}
		System.out.println("List after removing all elements" + nums);*/
		
		
		List<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("cba");
		list.add("abc");
		
		for (String object : list) {
			
			System.out.println("" + object);
		}
	}
}
