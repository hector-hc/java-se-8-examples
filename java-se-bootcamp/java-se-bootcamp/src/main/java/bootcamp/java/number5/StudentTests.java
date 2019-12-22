/**
 * Class: StudentTests.java
 * Author: hector.hernandez
 * Date: Dec 21, 2019
 */
package bootcamp.java.number5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class StudentTests {

	public static void main(String[] args) {
		Student[] students = new Student[4];
		Student samuel = new Student("Samuel", 29);
		samuel.setDescription("samuel es un excelente alumno");
		students[0] = samuel;
		students[1] = new Student("Carmen", 20);
		students[2] = new Student("Jorge", 40);
		students[3] = new Student("Jorge", 40);
		
		Arrays.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("------------STREAMS---------------");
		
		//List<Student> list = ;
		Arrays.asList(students).stream().forEach(System.out::println);
		
		
		System.out.println("------------NEWS---------------");
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Karla", 20));
		list.add(new Student("Monica", 25));
		list.add(new Student("Jesus", 29));
		
		list.stream().map(Student::getName).forEach(System.out::println);
		
		list.stream().forEach(e -> System.out.println(e.getName()));
	}
}
