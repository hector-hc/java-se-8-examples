/**
 * Class: Administrator.java
 * Author: hector.hernandez
 * Date: Nov 30, 2019
 */
package bootcamp.java.number4;

import java.time.LocalDate;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Administrator extends Employee {

	private double commission;
	
	/*public Administrator() {
		
	}*/
	
	public Administrator(String name, double salary, LocalDate hiringDate) {
		super(name, salary, hiringDate);
	}

	/**
	 * @return the commission
	 */
	public double getCommission() {
		return commission;
	}

	/**
	 * @param comission the commission to set
	 */
	public void setComission(double commission) {
		this.commission = commission;
	}
	
	@Override
	public double getSalary() {
		//double salaryBase = getSalary();
		double salaryBase = super.getSalary();
		double salaryFinal = salaryBase + commission;
		return salaryFinal;
	}
}
