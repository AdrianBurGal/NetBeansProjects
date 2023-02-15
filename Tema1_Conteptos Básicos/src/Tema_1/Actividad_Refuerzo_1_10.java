
package Tema_1;

import java.util.Scanner;

public class Actividad_Refuerzo_1_10 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); 
    
       double megabyte, kilobyte;
       
       System.out.print("Introduzca los MB: ");
       megabyte = teclado.nextDouble();
       
       kilobyte = megabyte * 1024;
       
       System.out.println("Los " + megabyte + " MB son " + kilobyte + " KB.");
               
    }  
}
