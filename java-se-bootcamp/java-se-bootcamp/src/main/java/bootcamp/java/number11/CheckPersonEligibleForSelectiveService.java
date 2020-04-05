/**
 * Class: CheckPersonEligibleForSelectiveService.java
 * Author: hector.hernandez
 * Date: Mar 21, 2020
 */
package bootcamp.java.number11;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class CheckPersonEligibleForSelectiveService implements CheckPerson<Person> {
	
	
	public boolean test(Person p) {
        return p.gender == Person.Sex.MALE &&
            p.getAge() >= 18 &&
            p.getAge() <= 25;
    }
}
