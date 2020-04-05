/**
 * Class: CheckPersonFemale.java
 * Author: hector.hernandez
 * Date: Mar 21, 2020
 */
package bootcamp.java.number11;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class CheckPersonFemale implements CheckPerson<Person> {

	public boolean test(Person person) {
		return person.getGender() == Person.Sex.FEMALE;
	}
}
