/**
 * Class: Dog.java
 * Author: hector.hernandez
 * Date: Apr 4, 2020
 */
package bootcamp.java.number11;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Dog {
	private String name;
	private int weight;
	private int age;
	/**
	 * @param name
	 * @param weight
	 * @param age
	 */
	public Dog(String name, int weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
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
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
