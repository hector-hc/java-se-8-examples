/**
 * Class: CGPAComparator.java
 * Author: hector.hernandez
 * Date: Feb 8, 2020
 */
package bootcamp.java.number8;

import java.util.Comparator;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class CGPAComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return (s1.cgpa.compareTo(s2.cgpa));
	}
}
