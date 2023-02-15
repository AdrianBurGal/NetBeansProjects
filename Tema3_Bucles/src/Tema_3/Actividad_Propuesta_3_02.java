package Tema_3;

import java.util.Scanner;

public class Actividad_Propuesta_3_02 {

    public static void main(String[] args) {

        int numeroVeces;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca cuantas veces se repite eco: ");
        numeroVeces = teclado.nextInt();
        
        for (;numeroVeces != 0;numeroVeces--){
      
            System.out.println("Eco...");
             
        }
    }
}
