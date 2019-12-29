/**
 * Class: Users.java
 * Author: hector.hernandez
 * Date: Dec 28, 2019
 */
package bootcamp.java.number6;

import java.util.Arrays;
import java.util.List;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class UserRepository {
	
	public List<User> users = Arrays.asList(new User("Andres"), new User("Alfonso"), new User("Josue"));
	
	public User findByName(String name) /*throws UserNotFoundException*/ {
		User userFound = null;
		for (User user : users) {
			if (user.getName().equalsIgnoreCase(name)) {
				userFound = user;
			}
		}
		
		if (userFound == null) {
			throw new UserNotFoundException("Usuario no encontrado");
		}
		return userFound;
	}
}
