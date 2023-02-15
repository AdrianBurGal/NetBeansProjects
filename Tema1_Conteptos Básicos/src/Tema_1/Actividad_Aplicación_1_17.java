package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_17 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       double medidaMilimetros, medidaCentimetros, medidaMetros, sumaTotal;
       
       System.out.print("Introduzca 3 medidas. La primera medida será en milímetros: ");
       medidaMilimetros = teclado.nextDouble();
               
       System.out.print("La segunda medida será en centímetros: ");
       medidaCentimetros = teclado.nextDouble();
               
       System.out.print("La tercera medida será en metros: ");
       medidaMetros = teclado.nextDouble();
       
       medidaMilimetros = medidaMilimetros * 0.1;
       medidaMetros = medidaMetros * 100;

       sumaTotal = medidaMilimetros + medidaCentimetros + medidaMetros;
       
       System.out.println("La longitud total medida en centímetros será de " + sumaTotal + " cm.");
 
       }
}
