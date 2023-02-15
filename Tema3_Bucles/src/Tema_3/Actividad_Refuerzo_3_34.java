package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_34 {

    public static void main(String[] args) {

        long numero1, numero2, resto1, resto2;
        long reverso = 0, restoReverso, numeroPar = 0, numeroImpar = 0;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        numero1 = Math.abs(teclado.nextInt());
        System.out.print("Introduzca el segundo número: ");
        numero2 = Math.abs(teclado.nextInt());

        while (numero1 > 0 || numero2 > 0) {
            
            // Separamos dígito a dígito del número1.
            resto1 = numero1 % 10;
            numero1 = numero1 / 10;
            
            // Separamos dígito a dígito del número2.
            resto2 = numero2 % 10;
            numero2 = numero2 / 10;
            
            // Unimos los dos números para saber los dígitos pares e impares.
            reverso = (reverso * 10) + resto2;
            reverso = (reverso * 10) + resto1;
        }

        System.out.println(reverso);
        while (reverso > 0) {

            // Separamos dígito a dígito.
            restoReverso = reverso % 10;
            reverso = reverso / 10;
            
            // Unimos los dígitos pares y los dígitos impares.
            if (restoReverso % 2 == 0) {
                numeroPar = (numeroPar * 10) + restoReverso;
            } else {
                numeroImpar = (numeroImpar * 10) + restoReverso;
            }
        }
        
        System.out.println("El número formado por los dígitos pares es " + numeroPar);
        System.out.println("El número formado por los dígitos impares es " + numeroImpar);
    }
}