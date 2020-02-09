/**
 * Class: Ecample12.java
 * Author: hector.hernandez
 * Date: Feb 8, 2020
 */
package bootcamp.java.number8;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example13 {

	public static void main(String[] args) {
		String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel, if you feel the feel  I feel, I feel the feel you feel i";
		Set<String> words = new HashSet<>();
		for (String word : tongueTwister.split("\\W+"))
			words.add(word.toUpperCase());
		System.out.println("The tongue twister is: " + tongueTwister);
		System.out.print("The words used were: ");
		System.out.println(words);
	}
}
