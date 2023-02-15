
package Tema_1;

import java.util.Scanner;

public class Actividad_1_12 {
    
        public static void main(String[] args) {
            
        // Escriba un programa que pida un numero al usuario y devuelva el valor absoluto.
        
        int numero, valorAbsolutoNum;
            
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        numero = teclado.nextInt();
                
        valorAbsolutoNum = numero > 0 ? numero : numero * -1;
                
        System.out.println("Su valor absoluto será: " + valorAbsolutoNum);
          
    }
}
