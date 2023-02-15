
package Tema_1;

import java.util.Scanner;

public class Prueba6 {

    public static void main(String[] args) {

   // Pedir la edad del usuario y mostrar la que tendrá el prox año.     
        
        Scanner teclado = new Scanner(System.in);  
        int edad;
            
        System.out.print("Introduzca su edad actual: ");
        edad = teclado.nextInt();
    
        edad = edad + 1;
    
        System.out.println("La edad que tendrá el próximo año será: " + edad);
    } 
}
