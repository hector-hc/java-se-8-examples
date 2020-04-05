/**
 * Class: TestDogs.java
 * Author: hector.hernandez
 * Date: Apr 4, 2020
 */
package bootcamp.java.number11;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class TestDogs {

	public static void main(String[] args) {
		
		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);
		
		/*DogQuerier qd1 = new DogQuerier() {
			
			@Override
			public boolean test(Dog g) {
				return g.getAge() > 9;
			}
		};*/
	
		DogQuerier dq = d -> { return d.getAge() > 9; };
		
		DogQuerier d1 = (d) -> d.getAge() > 9;
		DogQuerier d2 = d -> d.getAge() > 9;
		DogQuerier d3 = (Dog d) -> d.getAge() > 9;
		DogQuerier d4 = d -> { return d.getAge() > 9; };
		
		System.out.println("Is boi older than 9? " + dq.test(boi));
		System.out.println("Is clover older than 9? " + dq.test(clover));
	}
}
