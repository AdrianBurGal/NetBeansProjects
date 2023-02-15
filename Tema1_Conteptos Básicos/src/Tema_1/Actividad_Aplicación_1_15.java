package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_15 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       double a, b, x, c, y;
       
       System.out.println("Este programa calcula la (y) de un polinomio de segundo grado.");
       System.out.print("Introduzca el coeficiente de (a): ");
       a = teclado.nextDouble();
       
       System.out.print("Introduzca el coeficiente de (b): ");
       b = teclado.nextDouble();
       
       System.out.print("Introduzca el coeficiente de (c): ");
       c = teclado.nextDouble();
       
       System.out.print("Introduzca el valor de (x): ");
       x = teclado.nextDouble();

       y = a * x * x + b * x + c;
       
       System.out.println("La (y) valdrá: " + y);
       
        }
   }
