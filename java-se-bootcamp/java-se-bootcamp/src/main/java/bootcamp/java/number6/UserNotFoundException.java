/**
 * Class: UserNotFoundException.java
 * Author: hector.hernandez
 * Date: Dec 28, 2019
 */
package bootcamp.java.number6;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class UserNotFoundException extends Error {

	/**
	 * Serial UID.
	 */
	private static final long serialVersionUID = 4112309316049864639L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
