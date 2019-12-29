/**
 * Class: User.java
 * Author: hector.hernandez
 * Date: Dec 28, 2019
 */
package bootcamp.java.number6;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class User extends Object {
	
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "User [name = " + this.name + "]";
	}
}
