/**
 * Class: ExceptionExample01.java
 * Author: hector.hernandez
 * Date: Dec 28, 2019
 */
package bootcamp.java.number6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class ExceptionExample01 {

	public static void main(String[] args) {
		//int i = 0;
		//Employee employee = new Employee();
		//System.out.println("age: " + employee.getAge());
		//String name = null;
		//System.out.println("name:" + name.toLowerCase());
		//System.out.print("i = " + i);
		
		/*int i = 10;
		int x = 2;
		
		try {
			
			System.out.println("div: " + i / x);
			
		} catch (ArithmeticException ponchito) {
			System.err.println("Hubo un error, asegurate que x no sea cero");

		}*/
		
		//String x = "10";
		//String y = "0";
		
		/*try {
			
			Integer xi = Integer.valueOf(x);
			Integer yi = Integer.valueOf(y);
			
			Integer result = xi / yi;
			System.out.println(result);
			
		} catch (NumberFormatException | ArithmeticException e) {
			
			if (e instanceof NumberFormatException) {
				System.out.println("Hubo una exception NumberFormatException"); 
			}
			
			if (e instanceof ArithmeticException) {
				System.out.println("Hubo una exception ArithmeticException");
			}
			
			//nfe.printStackTrace();
			
		} /*catch (ArithmeticException ae) {
			
			System.out.println("Hubo una exception");
			
		}*/
		//BufferedReader br = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File("/Users/Hector/Documents/datos.csv")))) {
			
			
			
			System.out.println("El archivo fue leido existosamente");
			
			
		} catch (IOException fnfe) {
			
			System.out.println("No existe el archivo");
			
		} /*finally {
			System.out.println("Este es el FINALLY");
			try {
				br.close();
			} catch (IOException ioe) {
				
			}
		}*/
	}
}
