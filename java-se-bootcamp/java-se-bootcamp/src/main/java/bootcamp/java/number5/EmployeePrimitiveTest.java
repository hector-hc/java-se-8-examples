/**
 * Class: EmployeePrimitiveTest.java
 * Author: hector.hernandez
 * Date: Dec 21, 2019
 */
package bootcamp.java.number5;

import bootcamp.java.number4.*;
//import bootcamp.java.number4.Employee
import java.time.LocalDate;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class EmployeePrimitiveTest {

	public static void main(String[] args) {
		bootcamp.java.number4.Student s = new bootcamp.java.number4.Student("Liz");
		Employee e = new Employee("Sara", 1.2, LocalDate.now());
	}
}
