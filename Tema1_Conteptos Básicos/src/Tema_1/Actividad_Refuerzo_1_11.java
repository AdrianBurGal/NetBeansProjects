package Tema_1;

import java.util.Scanner;

public class Actividad_Refuerzo_1_11 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); 
    
       double megabyte, kilobyte;
       
       System.out.print("Introduzca los KB: ");
       kilobyte = teclado.nextDouble();
       
       megabyte = kilobyte / 1024;
       
       System.out.println("Los " + kilobyte + " KB son " + megabyte + " MB.");
      
   }
   
}
