
package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_14 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);

       double base, altura, areaTriangulo;
       
       System.out.print("Dime cuánto mide la base: ");
       base = teclado.nextDouble();
       
       System.out.print("Dime cuánto mide la altura: ");
       altura = teclado.nextDouble();
       
       areaTriangulo = (base * altura) / 2;
       
       System.out.println("El área del triángulo será de " + areaTriangulo + " m");
    }
   }
