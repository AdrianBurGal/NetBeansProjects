package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_21 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       double num1, num2;
       boolean respuesta;
       
       System.out.print("Introduzca dos números: ");
       num1 = teclado.nextDouble();
       num2 = teclado.nextDouble();
       
       respuesta = num1 == num2;
       
       System.out.println(respuesta);
   }
}
