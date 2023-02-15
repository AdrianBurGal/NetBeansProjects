
package Tema_1;

import java.util.Scanner;

public class Actividad_Refuerzo_1_09 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); 
   
       final double PI = 3.1416;
       double radio, altura, volumen;
       
       System.out.print("¿Cuánto mide el radio? ");
       radio = teclado.nextDouble();
       System.out.print("¿Cuánto mide la altura? ");
       altura = teclado.nextDouble();
       
       volumen = PI * radio * radio * altura / 3;
   
       System.out.println("El volumen del cono es: " + volumen + " cm³");
    }
    
}
