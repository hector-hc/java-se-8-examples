/**
 * Class: Example02.java
 * Author: hector.hernandez
 * Date: Mar 21, 2020
 */
package bootcamp.java.number11;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example02 {

	public static void main(String[] args) {
		
		Bar b = new Bar();
		
		/*b.methodBar(new Foo() {
			
			@Override
			public void methodFoo() {
				System.out.println("Method foo");
				
			}
		});
		
		Foo foo = new Foo() {
			
			@Override
			public void methodFoo() {
				System.out.println("Method foo 2");
				
			}
		};
		
		b.methodBar(foo);*/
		
		
		
		
		
		
		
		
		
		
		/*b.methodBar(() -> {
			System.out.println("Method foo 3 l1");
			System.out.println("Method foo 3 l2");
			System.out.println("Method foo 3 l3");
			System.out.println("Method foo 3 l4");
		});*/
		
		
		
		Foo foo = () ->  {
			System.out.println("Method foo 4 l1");
			System.out.println("Method foo 4 l2");
			System.out.println("Method foo 4 l3");
			System.out.println("Method foo 4 l4");
		};
		
		
		b.methodBar(foo);
		
		
		/*b.doStuff(() -> System.out.println("foofy"));
		
		
		Foo foo = () ->  System.out.println("foofy 2");
		
		b.doStuff(foo);*/
	}
}
