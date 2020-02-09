/**
 * Class: Example11.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example11 {
	public static void main(String[] args) {
		ArrayList<String> languageList = new ArrayList<>();
		
		//
		languageList.add("C");
		languageList.add("C++");
		languageList.add("Java");
		languageList.add("Go");
		languageList.add("Python");
		
		for(String language : languageList) {
		    System.out.println(language);
		}
		
		System.out.println("***************************************");
		
		for(Iterator<String> languageIter = languageList.iterator(); languageIter.hasNext(); ) {
	        String language = languageIter.next();
	        System.out.println(language);
		}
		
		System.out.println("***************************************");
		
		for (int i = 0; i < languageList.size(); i++) {
			System.out.println("" + languageList.get(i));
		}
	}
}
