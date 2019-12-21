/**
 * Class: Person.java
 * Author: hector.hernandez
 * Date: Nov 30, 2019
 */
package bootcamp.java.number4;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public abstract class Person extends Object {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public abstract String getDescription();
	
	public String getName() {
		return this.name;
	}
	
}
