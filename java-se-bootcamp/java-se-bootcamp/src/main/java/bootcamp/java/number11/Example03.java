/**
 * Class: Example03.java
 * Author: hector.hernandez
 * Date: Mar 21, 2020
 */
package bootcamp.java.number11;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example03 {

	public static void main(String[] args) {
		List<Person> listOfPerson = Person.createRoster();
		
		//printPersonsOlderThan(listOfPerson, 19);
		
		
		//System.out.println("-----------------------------------------------------------");
		//printPersonsWithinAgeRange(listOfPerson, 20, 39);
		
		
		//System.out.println("-----------------------------------------------------------");
		//printPersons(listOfPerson, new CheckPersonEligibleForSelectiveService());
		//printPersons(listOfPerson, new CheckPersonFemale());
		
		
		//System.out.println("-----------------------------------------------------------");
		/*printPersons(listOfPerson, new CheckPerson() {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});*/
		
		
		/*System.out.println("-----------------------------------------------------------");
		
		printPersons(listOfPerson,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);*/
		
		
		System.out.println("-----------------------------------------------------------");
		
		
		/*printPersonsWithPredicate(listOfPerson,
				g -> g.getGender() == Person.Sex.MALE && g.getAge() >= 18 && g.getAge() <= 25);*/
		
		/*System.out.println("-----------------------------------------------------------");
		processPersons(
				listOfPerson, 
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
				p -> p.printPerson());*/
		
		System.out.println("-----------------------------------------------------------");
		/*processPersonsWithFunction(
				listOfPerson,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25, 
				p -> p.getEmailAddress(),
				email -> System.out.println(email));*/
				
		
		listOfPerson.stream()
			.filter((Person person) -> person.getGender() == Person.Sex.MALE && person.getAge() >= 0 && person.getAge() <= 25)
			.mapToInt((Person p) -> p.getAge())
			.forEach(age -> System.out.println(age));
		
		
		//listOfPerson.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25)
				//.map(p -> p.getEmailAddress()).forEach(email -> System.out.println(email));

	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for (Person p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}

	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}
	
	public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				block.accept(p);
			}
		}
	}
	
	public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
			Function<Person, String> mapper, Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

}
