
package Tema_1;

import java.util.Scanner;

public class Actividad_1_14 {
    
        public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);
            
        double numeroDecimal;
        int numeroEntero;
        
            System.out.println("Escribe un número decimal: ");
            
            numeroDecimal = teclado.nextDouble();
            
            numeroEntero = (int)(numeroDecimal + 0.5);
            
            System.out.println("El número redondeado será: " + numeroEntero);
        }

    
}
