/**
 * Class: UserMain.java
 * Author: hector.hernandez
 * Date: Dec 28, 2019
 */
package bootcamp.java.number6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class UserMain {

	public static void main(String[] ars) {
		
		UserRepository userRepository = new UserRepository();
		//userRepository.addUser(new User(1L, "Hector", (short) 34));
		/*try {
			User user = userRepository.findByName("josue");
			System.out.println("usuario encontrado: " + user);
			
		} catch (UserNotFoundException unfe) {
			
			System.err.println("message: " + unfe.getMessage());
			
		}*/
		
		// Get All Users
		List<User> users = userRepository.getAll();
		
		for (User user : users) {
			System.out.println(user);
		}
		
		//users.stream().forEach(System.out::println);
		
		//User userNew = new User(14L, "Carmen", (short) 36);
		
		//userRepository.addUser(userNew);
		
		//System.out.println("Se guardo correctamente --------------------------------");
		
		//users.stream().forEach(System.out::println);
		
		/*Path testFilePath = Paths.get("/Users/Hector/Documents/javabootcamp/users.txt");
		System.out.println("Parent: " + testFilePath.getParent());
		System.out.println("Root: " + testFilePath.getRoot());*/
		
		
		/*Path pathSource = Paths.get("/Users/Hector/Documents/javabootcamp/users.txt");
        Path pathDestination = Paths.get("/Users/Hector/Documents/javabootcamp/users_copy.txt");
        try {
                Files.copy(pathSource, pathDestination);
                System.out.println("Source file copied successfully");
        } catch (IOException e) {
                e.printStackTrace();
        }*/
		
        /*Path pathSourceMove = Paths.get("/Users/Hector/Documents/javabootcamp/users.txt");
        Path pathDestinationMove = Paths.get("/Users/Hector/Documents/javabootcamp/move/users_ponchito.txt");
        try {
        	Files.move(pathSourceMove, pathDestinationMove, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Source file moved successfully");
        } catch (IOException e) {
                e.printStackTrace();
        }*/
		
		/*Path pathSource = Paths.get("/Users/Hector/Documents/javabootcamp/move/users.txt");
        try {
                Files.delete(pathSource);
                System.out.println("File deleted successfully");
        } catch (IOException e) {
                e.printStackTrace();
        }*/
	}
}
