/**
 * Class: Example01.java
 * Author: hector.hernandez
 * Date: Feb 1, 2020
 */
package bootcamp.java.number8;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Example01 {
	public static void main (String[] args) {
		int a = 10;
		
		/*if (1 == 2 && (a++ == 20)) {
			System.out.println("Operador lógico && ");
		}
		
		System.out.println("1.- Valor de a = " + a);
		
		if (2 == 2 & (a++ == 20)) {
			System.out.println("Operador lógico & ");
		}*/
		
		//System.out.println("2.- Valor de a = " + a);
		
		
		System.out.println("------------------------------");
		
		int b = 20;
		
		if (2 == 1 || (b++ == 20)) {
			System.out.println("Operador lógico || ");
		}
		
		System.out.println("1.- Valor de b = " + b);
		
		if (2 == 1 | (b++ == 20)) {
			System.out.println("Operador lógico | ");
		}
		
		System.out.println("2.- Valor de b = " + b);
	}
}
