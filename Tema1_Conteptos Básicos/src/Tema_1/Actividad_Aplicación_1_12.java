
package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_12 {
    
     public static void main(String[] args) {
            
        Scanner teclado = new Scanner(System.in);
        
        int num, numNecesario;
        int multiplo = 7;
        
        System.out.print("Introduzca un número entero: ");
        num = teclado.nextInt();
       
        numNecesario = multiplo - (num % multiplo);
        
        System.out.println("A " + num + " hay que sumarle " + numNecesario + " para que el resultado sea múltiplo de 7.");
         
     }
}
