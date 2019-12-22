/**
 * Class: Student.java
 * Author: hector.hernandez
 * Date: Dec 21, 2019
 */
package bootcamp.java.number5;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private String description;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getDescription() {
		return "eres un estudiante de Java";
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}
	
	@Override
	public String toString() {
		return "Name=" + this.name + ", age=" + this.age + ", description=" + this.description;
	}
}
