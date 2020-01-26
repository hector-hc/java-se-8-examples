/**
 * Class: Account.java
 * Author: hector.hernandez
 * Date: Jan 25, 2020
 */
package bootcamp.java.number7;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Account {
	private String number = "1234-455-44";
	private double balance;
	
	public Account() {
		this.balance = 1000.0;
	}
	
	public synchronized void withdraw(double amount) {
		this.balance = balance - amount;	
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getNumber() {
		return this.number;
	}
}
