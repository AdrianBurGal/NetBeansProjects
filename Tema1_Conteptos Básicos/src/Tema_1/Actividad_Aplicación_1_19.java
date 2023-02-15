package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_19 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
    
       int entradasInfantiles, entradasAdultos;
       final double PRECIO_INFANTIL = 15.50;
       final int PRECIO_ADULTO = 20;
       double precioTotal, precioFinal;
       
       System.out.print("¿Cuántas entradas infantiles quieres? ");
       entradasInfantiles = teclado.nextInt();
       
       System.out.print("¿Cuántas entradas de adultos quieres? ");
       entradasAdultos = teclado.nextInt();
       
       precioTotal = (entradasInfantiles * PRECIO_INFANTIL) + (entradasAdultos * PRECIO_ADULTO);
       
       precioFinal = precioTotal >= 100 ? precioTotal - (precioTotal * 0.05) : precioTotal;
       
       System.out.println("El precio total será de " + precioFinal + "€.");
       
   }
}