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
public class User {
	
	private Long id;
	private String name;
	private Short age;
	
	public User(Long id, String name, Short age) {
		this.id = id;
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("El nombre es incorrecto, con el ID = " + id);
		}
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	public Short getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [id= " + id + ", name = " + this.name + ", age= " + age + "]";
	}
}
