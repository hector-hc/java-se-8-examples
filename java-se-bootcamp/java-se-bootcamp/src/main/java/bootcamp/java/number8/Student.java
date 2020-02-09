/**
 * Class: Student.java
 * Author: hector.hernandez
 * Date: Feb 8, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Student /*implements Comparable<Student>*/ {

	String id;
	String name;
	Double cgpa;

	public Student(String studentId, String studentName, double studentCGPA) {
		id = studentId;
		name = studentName;
		cgpa = studentCGPA;
	}

	@Override
	public String toString() {
		return " \n " + id + "\t " + name + "\t " + cgpa;
	}

	/*@Override
	public int compareTo(Student that) {
		
		return this.id.compareTo(that.id);
		
	}*/
}
