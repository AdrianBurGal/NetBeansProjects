package Tema_1;

import java.util.Scanner;

public class Actividad_Aplicación_1_16 {
    
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       
       int cantidadSeg, horas, minutos, segundos, resto;
       
       System.out.print("Introduzca el número de segundos para calcular la hora total: ");
       cantidadSeg = teclado.nextInt();
       
       horas = cantidadSeg / 3600;
       resto = cantidadSeg % 3600;
       minutos = resto / 60;
       segundos = resto % 60;
       
       System.out.println("Los " + cantidadSeg + " segundos son " + horas 
               + " hora " + minutos + " minutos y " + segundos + " segundos.");

        }
   }
