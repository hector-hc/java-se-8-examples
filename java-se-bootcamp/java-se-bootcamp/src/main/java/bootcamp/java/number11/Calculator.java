/**
 * Class: Calculator.java
 * Author: hector.hernandez
 * Date: Apr 4, 2020
 */
package bootcamp.java.number11;

/**
 * @author hector.hernandez
 * @Version 1.0
 */
public class Calculator {
	
	public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String... args) {
    
        Calculator myApp = new Calculator();
        
        IntegerMath addition = (a, b) -> a + b;
        
        IntegerMath subtraction = (a, b) -> a - b;
        
        IntegerMath multi = (a, b) -> a * b;
        
        IntegerMath div = (a, b) -> a / b;
        
        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
        System.out.println("20 * 3 = " + myApp.operateBinary(20, 3, multi));
        System.out.println("21 / 3 = " + myApp.operateBinary(21, 3, div));
        
        /*int option = 0;
        
        switch (option) {
        case 1:
        	System.out.println("suma");
        	break;
        case 2:
        	System.out.println("resta");
        	break;
        case 3:
        	System.out.println("multiplication");
        	break;
        	default:
        	System.out.println("opcion no valida");
        }*/
    }
}
