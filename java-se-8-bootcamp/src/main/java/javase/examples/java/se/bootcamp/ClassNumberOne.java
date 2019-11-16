
/**
 * @Class ClassNumberOne
 * @author Hector
 * @Created on Nov 16, 2019, 12:10:09 PM
 */

package javase.examples.java.se.bootcamp;

public class ClassNumberOne {

    public static void main(String[] args) {
        /**
         * Comentarios al código con lineas multiples
         */
        
        // Comentario a una solo linea
        
        //-----------------------------------------
        // 1.- TIPOS DE DATOS
        
        // 1.1 .- Enteros
        
        int v01 = 1;
        short v02 = 1;
        long v03 = 1;
        byte v04 = 1;
        
        // 1.2 Tipos de coma flotante
        
        float v05 = 1.0f;
        double v06 = 2.0;
        // 1.3 Tipo bollean
        
        boolean v07 = true;
        
        //-----------------------------------------
        
        // 2.- VARIABLES
        
        int v08;
        int v09, v10 = 0;
        
        //-----------------------------------------
        
        // 3.- CONSTANTES
        
        final double salary = 100.0;
        
        //-----------------------------------------
        
        // 4.- OPERADORES ARITMETICOS
        
        int resultSum = v01 + v02;
        int resultSubstract = v01 - v02;
        int resultMultiply = v01 * v02;
        int resultModule = v01 % v02;
        
        //-----------------------------------------
        
        // 5.- OPERADORES DE INCREMENTO Y DECREMENTO
        
        v01++;
        ++v01;
        v02--;
        --v02;
        
         //-----------------------------------------
        
        // 5.- OPERADORES RELACIONALES Y BOOLEANOS
        
        boolean opt01  = 3 == 7;
        System.out.println("3 == 7 : " + opt01);
        boolean opt02  = 3 != 7;
        boolean opt03  = 3 > 7;
        boolean opt04  = 3 >= 7;
        boolean opt05  = 3 < 7;
        boolean opt06  = 3 <= 7;
        
        // 6.- CONVERSIONES ENTRE TIPOS NUMERICOS
        
        short v13 = 1;
        int v14 = v13;
       
        // 6.1 Redudiciones
        long v11 = 10;
        int v12 = (int) v11;
       
        // 6.2 Parentesis y jerarquia de operadores
       
        int v15 = 1;
        v15 += 4;
        
        int v16 = 3;
        int v17 = (v15 + 2) + 1;
        
        // 7.- Cadenas
        
        String description = "Bootcamp Java 8";
        
        // 7.1 Subcadenas
        
        String sub = description.substring(9, description.length());
        
        // 7.2 Concatenación
        
        String descriptionConcat = description + ", The best language";
        
        // 7.3 Determinaciones de igualdad
        
        String name = "hector";
        
        boolean isEquals = name.equals("hec");
        
        boolean isEqualsIgnoreCase = name.equals("HECTOR");
        
        boolean isEqualsOp = name == "hernandez";
        
        boolean isEqualsCompare = name.compareTo("chavez") == 0;
        
        boolean isEqualsCompareIgnoreCase = name.compareToIgnoreCase("chavez") == 0;
    }
}
