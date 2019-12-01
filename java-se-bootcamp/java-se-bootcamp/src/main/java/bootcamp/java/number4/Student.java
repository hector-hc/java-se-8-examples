/**
 * Class: Student.java
 * Author: hector.hernandez
 * Date: Nov 30, 2019
 */
package bootcamp.java.number4;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Student extends Person {

	/**
	 * @param name
	 */
	public Student(String name) {
		super(name);
	}

	public String getDescription() {
		return super.getName() + " es un estudiante de Java";
	}
}
