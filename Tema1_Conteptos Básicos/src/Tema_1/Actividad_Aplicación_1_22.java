package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_22 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); 
       
       double lanzamientoMetros;
       int lanzamientoCentímetros;
       
       System.out.print("Dime la longitud del lanzamiento en metros: ");
       lanzamientoMetros = teclado.nextDouble();
       
       lanzamientoCentímetros = (int)(lanzamientoMetros * 100);
       
       System.out.println("La longitud contabilizada es " + lanzamientoCentímetros + " cm.");
   }  
}
