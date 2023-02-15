package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_18 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       int hormigas, arañas, cochinillas, patasTotales;
       final int patasHormigas = 6;
       final int patasArañas = 8;
       final int patasCochinillas = 14;
       
       System.out.print("¿Cuántas hormigas hay? ");
       hormigas = teclado.nextInt();
       
       System.out.print("¿Cuántas arañas hay? ");
       arañas = teclado.nextInt();
       
       System.out.print("¿Cuántas cochinillas hay? ");
       cochinillas = teclado.nextInt();

       patasTotales = (hormigas * patasHormigas) + (arañas * patasArañas) + (cochinillas * patasCochinillas);
       
       System.out.println("El total de patas que hay son " + patasTotales);
       
   }
}
