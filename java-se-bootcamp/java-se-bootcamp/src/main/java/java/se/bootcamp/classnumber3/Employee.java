/**
 * Class: Employee.java
 * Author: hector.hernandez
 * Date: Nov 23, 2019
 */
package java.se.bootcamp.classnumber3;

import java.util.Date;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Employee {

	private String name;
	private double salary;
	private Date hiringDate;
	
	public Employee() {
	}

	/**
	 * @param name
	 * @param salary
	 * @param hiringDate
	 */
	public Employee(String name, double salary, Date hiringDate) {
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
	public Date getHiringDate() {
		return hiringDate;
	}

	/**
	 * @param hiringDate the hiringDate to set
	 */
	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}
	
	public void raiseSalary(double percentaje) {
		double raise = this.salary * percentaje / 100;
		this.salary += raise;
	}
}
