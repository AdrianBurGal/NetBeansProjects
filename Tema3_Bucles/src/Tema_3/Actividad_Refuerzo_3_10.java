package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_10 {

    public static void main(String[] args) {

        int numero, numeroTotal = 0, media, contador = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numero = teclado.nextInt();

        while (numero >= 0) {
            numeroTotal = numeroTotal + numero;
            contador++;
            numero = teclado.nextInt();
        }

        media = numeroTotal / contador;

        System.out.println("La media de " + numeroTotal + " / " + contador + " es " + media);
    }
}
