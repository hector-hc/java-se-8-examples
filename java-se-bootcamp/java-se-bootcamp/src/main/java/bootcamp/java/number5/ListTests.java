/**
 * Class: ListTests.java
 * Author: hector.hernandez
 * Date: Dec 21, 2019
 */
package bootcamp.java.number5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bootcamp.java.number4.Employee;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class ListTests {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Sara", 1230.04, LocalDate.of(2018, 1, 1)));
		employees.add(new Employee("Pedro", 23345.04, LocalDate.of(2017, 5, 15)));
		
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
	}
}
