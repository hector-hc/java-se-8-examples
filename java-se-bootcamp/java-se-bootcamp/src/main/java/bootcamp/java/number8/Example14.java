/**
 * Class: Example14.java
 * Author: hector.hernandez
 * Date: Feb 8, 2020
 */
package bootcamp.java.number8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example14 {

	public static void main(String[] args) {
		Map<String, String> misspeltWords = new HashMap<>();
		
		misspeltWords.put("calender", "calendar");
		misspeltWords.put("tomatos", "tomatoes");
		misspeltWords.put("existance", "existence");
		misspeltWords.put("aquaintance", "acquaintance");
		misspeltWords.put("mejico", "mexico");
		misspeltWords.put("te", "the");
		
		String sentence = "Buy a calender for te year 2013";
		
		System.out.println("The given sentence is: " + sentence);
		
		for (String word : sentence.split("\\W+")) {
			if (misspeltWords.containsKey(word)) {
				System.out.println("The correct spelling for " + word + " is: " + misspeltWords.get(word));
			}
		}
		
		Set<String> keys = misspeltWords.keySet();
		System.out.print("Misspelt words in spellchecker are: ");
		System.out.println(keys);

	}
}
