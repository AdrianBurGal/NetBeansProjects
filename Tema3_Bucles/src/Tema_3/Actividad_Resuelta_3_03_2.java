package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_03_2 {

    public static void main(String[] args) {

        int numeroIntroducido = 0, numeroReal, contador = 1;

        Scanner teclado = new Scanner(System.in);

        numeroReal = (int) (Math.random() * 100 + 1);

        System.out.print("Introduzca un número [1-100] ");
        numeroIntroducido = teclado.nextInt();

        do {

            contador = contador + 1;

            if (numeroIntroducido < numeroReal) {
                System.out.println("Inténtelo otra vez. El número buscado es mayor al introducido.");
            } else {
                System.out.println("Inténtelo otra vez. El número buscado es menor al introducido.");
            }
            System.out.print("Introduzca otro número: ");
            numeroIntroducido = teclado.nextInt();

        } while (numeroIntroducido != numeroReal && numeroIntroducido > 0 && contador < 5);

        if (numeroIntroducido == numeroReal) {
            System.out.println("¡¡Enhorabuena, has ganado!!");
        } else if (contador == 5) {
            System.out.println("Límite de intentos superado. ¡Has perdido!");
        } else {
            System.out.println("Te has rendido.");
        }

    }
}
