/**
 * Class: Employee.java
 * Author: hector.hernandez
 * Date: Nov 30, 2019
 */
package bootcamp.java.number4;

import java.time.LocalDate;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Employee {

	private String name;
	private double salary;
	private LocalDate hiringDate;
	
	public Employee() {
	}
	
	/**
	 * @param name
	 * @param salary
	 */
	public Employee(String name, double salary, LocalDate hiringDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hiringDate = hiringDate;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the hiringDate
	 */
	public LocalDate getHiringDate() {
		return hiringDate;
	}

	/**
	 * @param hiringDate the hiringDate to set
	 */
	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}
	
}
