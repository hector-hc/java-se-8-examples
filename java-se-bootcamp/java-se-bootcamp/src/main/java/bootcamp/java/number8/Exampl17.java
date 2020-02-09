/**
 * Class: Exampl17.java
 * Author: hector.hernandez
 * Date: Feb 8, 2020
 */
package bootcamp.java.number8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Exampl17 {

	public static void main(String[] args) {
		List<String> playList = new LinkedList<>();
		playList.add("Rock With You - 1979");
		playList.add("Billie Jean - 1983");
		playList.add("Man In the Mirror - 1988");
		playList.add("Black Or White - 1991");
		System.out.println("The original playlist of MJ's songs");
		System.out.println(playList);

		System.out.println("\nThe reversed playlist");
		Collections.reverse(playList);
		System.out.println(playList);
		System.out.println("\nNow after shuffling the playlist");
		Collections.shuffle(playList);
		System.out.println(playList);
		System.out.println("\nSort the songs by their names ");
		Collections.sort(playList);
		System.out.println(playList);
		System.out.println("\nIs my most favourite song Black Or White - 1991 present in the list?");
		String backOrWhiteSong = "Black Or White - 1991";
		int index = Collections.binarySearch(playList, backOrWhiteSong);
		if (index >= 0)
			System.out.printf("Yes, its the %d song \n", (index + 1));
		else
			System.out.printf("No, its not there in the playlist \n");
	}
}
