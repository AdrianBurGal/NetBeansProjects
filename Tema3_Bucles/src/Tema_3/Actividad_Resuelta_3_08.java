package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_08 {

    public static void main(String[] args) {

        int numero, sumaNumero = 0;
        double media;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca diez números: ");

        for (int contador = 10; contador > 0; contador--) {

            numero = teclado.nextInt();
            sumaNumero = sumaNumero + numero;
        }
        media = sumaNumero / 10.0;

        System.out.println("La media es: " + media);
    }

}
