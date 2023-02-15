package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_23 {

    public static void main(String[] args) {

        int numeroIntroducido, resultado = 0, contador = 1;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        numeroIntroducido = Math.abs(teclado.nextInt());
        resultado = resultado + numeroIntroducido;
        
        for (;resultado <= 10000; contador++){
            
            System.out.print("Introduzca un número: ");
            numeroIntroducido = Math.abs(teclado.nextInt());
            resultado += numeroIntroducido;
        }
               
        System.out.printf("La suma de los %d números es %d. \n",contador, resultado);
        System.out.println("La media es de " + (resultado/contador));
        
    }
}
