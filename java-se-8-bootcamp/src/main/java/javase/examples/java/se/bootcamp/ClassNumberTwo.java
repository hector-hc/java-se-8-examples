
/**
 * @Class ClassNumberTwo
 * @author Hector
 * @Created on Nov 16, 2019, 12:36:36 PM
 */

package javase.examples.java.se.bootcamp;

public class ClassNumberTwo {

    public static void main(String[] args) {
        // 1.- FLUJOS DE CONTROL
        
        // 1.1.- Sentencia condicionales
        
        if (1 == 2) {
            System.out.println("Nunca se imprimira");
        }
        
        // 1.2.- ELSE
        
        int age = 20;
        if (age <= 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
        
        // 1.2 BUCLES
        
        // 1.2.1 while
        
        int control = 10;
        
        while(control > 1) {
            System.out.println("El valor de control es " + control);
            --control;
        }
        
        // 1.2.2 do while
        
        int controlDo = 10;
        do {
            System.out.println("Siempre se imprimira la prima vez");
        } while (controlDo < 9);
        
        // 1.2.3 Bucle determinados
        
        for (int i = 1; i <= 10; i++)
            System.out.println("El valor de i es: " + i);
        
        for (int i = 10; i < 0; i--)
            System.out.println("El valor de i es: " + i);
        
        // Selecciones múltiples
        
        int age01 = 20;
        switch (age01) {
            case 10:
                System.out.println("Tienes 10 años");
                break;
            case 8:
                System.out.println("Tienes 20 años");
                break;
            default:
                System.out.println("NO tienes 20 años, ni tampoco 10 años");
                break;
        }
        
        // MATRICES
        
        String[] names = new String[5];
        names[0] = "Juan";
        names[1] = "Carlos";
        names[2] = "Pedro";
        names[3] = "Ismael";
        names[4] = "Diana";
        
        String[] names01 = new String[] {"Juan", "Carlos", "Pedro", "Ismael", "Diana"};
        
        String[] names02 = {"Juan", "Carlos", "Pedro", "Ismael", "Diana"};
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("index: " + i + ", value: " + names[i]);
        }
    }
}
