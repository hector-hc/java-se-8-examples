/**
 * Class: StudentMain.java
 * Author: hector.hernandez
 * Date: Nov 30, 2019
 */
package bootcamp.java.number4;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class StudentMain {

	public static void main(String[] args) {
		Person student = new Student("Pedro");
		
		System.out.println("" + student.getDescription());
	}
}
