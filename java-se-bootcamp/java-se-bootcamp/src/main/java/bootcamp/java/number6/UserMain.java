/**
 * Class: UserMain.java
 * Author: hector.hernandez
 * Date: Dec 28, 2019
 */
package bootcamp.java.number6;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class UserMain {

	public static void main(String[] ars) {
		
		UserRepository userRepository = new UserRepository();
	
		try {
			User user = userRepository.findByName("hector");
			System.out.println("usuario encontrado: " + user);
			
		} catch (UserNotFoundException unfe) {
			
			System.err.println("message: " + unfe.getMessage());
			
		}
		
	}
}
