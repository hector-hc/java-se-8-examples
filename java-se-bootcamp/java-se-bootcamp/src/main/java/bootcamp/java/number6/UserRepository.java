/**
 * Class: Users.java
 * Author: hector.hernandez
 * Date: Dec 28, 2019
 */
package bootcamp.java.number6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class UserRepository {
	
	//public List<User> users = Arrays.asList(new User(1L, "Andres"), new User(2L, "Alfonso"), new User(3L, "Josue"));
	
	public List<User> users = new ArrayList<User>();
	
	public UserRepository() {
		
		
	}
	
	public User findByName(String name) throws UserNotFoundException {
		/*User userFound = null;
		for (User user : users) {
			if (user.getName().equalsIgnoreCase(name)) {
				userFound = user;
			}
		}
		
		if (userFound == null) {
			throw new UserNotFoundException("Usuario no encontrado");
		}
		return userFound;*/
		return users.stream().filter(user -> user.getName().equalsIgnoreCase(name)).findAny().orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
	}
	
	
	public List<User> getAll() {
		users = new ArrayList<User>();
		/*try (BufferedReader br = new BufferedReader(new FileReader(new File("/Users/Hector/Documents/javabootcamp/users.txt")))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] fields = line.split("\\|");
				Long id = Long.valueOf(fields[0]);
				String name = fields[1];
				Short age = Short.valueOf(fields[2]);
				User user = new User(id, name, age);
				users.add(user);
			}
			
		} catch (IOException ioe) {
			System.out.println("Error al leer archivos");
		}*/
		
		/*try (Scanner tokenizingScanner = new Scanner(new FileReader("/Users/Hector/Documents/javabootcamp/users.txt"))) {
			tokenizingScanner.useDelimiter("\\n");
			while (tokenizingScanner.hasNext()) {
				String line = tokenizingScanner.next();
				String[] fields = line.split("\\|");
				User user = null;
				try {
					
					user = new User(Long.valueOf(fields[0]), fields[1], Short.valueOf(fields[2]));
					
				} catch (IllegalArgumentException iae) {
					System.out.println("error " + iae.getMessage());
				}
				
				users.add(user);
			}
		} catch (IOException ioe) {
			System.out.println("Error al leer los usuarios");
		}*/
		try (Stream<String> stream = Files.lines(Paths.get("/Users/Hector/Documents/javabootcamp/users.txt"))) {
			stream.forEach(line -> {
				String[] fields = line.split("\\|");
				User user = null;
				try {
					
					user = new User(Long.valueOf(fields[0]), fields[1], Short.valueOf(fields[2]));
					
				} catch (IllegalArgumentException iae) {
					System.out.println("error " + iae.getMessage());
				}
				
				users.add(user);
			});
		} catch (IOException ioe) {
			System.out.println("Error al leer los usuarios");
		}
		return this.users;
	}
	
	public void addUser(User user) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/Hector/Documents/javabootcamp/users.txt", true))) {
			String line = user.getId() + "|" + user.getName() + "|" + user.getAge();
			writer.newLine();
			writer.write(line);
			writer.flush();
			
		} catch (IOException ioe) {
			System.out.println("Error al guardar User");
		}
	}
}
