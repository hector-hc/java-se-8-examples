/**
 * Class: Main.java
 * Author: hector.hernandez
 * Date: Nov 30, 2019
 */
package bootcamp.java.number4;

import java.time.LocalDate;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class ClassNumeroFourMain {

	public static void main(String[] args) {
		// HERENCIA
		
		// Constructores de la super clase
		// Metodos de la super clase
		// super debe se la primera linea del constructors si no se llama super se invoca el constructor default
		
		Employee employee1 = new Employee("Sara", 7000, LocalDate.of(2017, 1, 15));
		// No existe metodo
		//employee.setCommission(3000);
		
		System.out.println("sueldo employee: " + employee1.getSalary());
		
		Administrator admin1 = new Administrator("Juan", 8000, LocalDate.of(2018, 11, 5));
		admin1.setComission(2000);
		
		System.out.println("sueldo administrador: " + admin1.getSalary());
		
		Employee employee2 = new Employee("Ramon", 7500, LocalDate.of(2015, 3, 20));
		
		Employee[] employees = new Employee[3];
		
		// Polimorfismo
		employees[0] = admin1;
		employees[1] = employee1;
		employees[2] = employee2;
		
		System.out.println("--------------------------------");
		
		for (Employee e : employees) {
			System.out.println("Empleados- NOMBRE " + e.getName() + ", salario " + e.getSalary());
		}
	
		// Todo Admisnitrador es un empleado
		// NO TODO empleado es un administrador
		
		Employee admin2 = new Administrator("Gabriela", 12000, LocalDate.of(2019, 12, 1));
		
		Administrator[] arrayOfAdmis = new Administrator[4];
		Employee[] arrayOfAdmisCopy = arrayOfAdmis;
		
		// Evitar la herencia: Clases y metodos finales
		
		// Refundición
		
		System.out.println("--------------------------------");
		
		for (Employee e : employees) {
			if (e instanceof Administrator) {
				System.out.println("" + e.getName() + " es un administrador");
			} else {
				System.out.println("" + e.getName() + " es un empleado");
			}
		}
		
	}
}
