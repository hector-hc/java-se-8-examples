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

	@Override
	public String getDescription() {
		return super.getName() + " es un estudiante de Java";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof String) {
			String s = (String) o;
			boolean b = getName().equals(s);
			return b;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "name=" + super.getName();
	}
}
