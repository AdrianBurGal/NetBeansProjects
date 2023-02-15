package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_12 {

    public static void main(String[] args) {

        double nota = 0;
        int suspenso = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca 5 notas: ");

        for (int contador = 1; contador <= 5; contador++) {
            nota = teclado.nextDouble();

            if (nota < 5) {
                suspenso = suspenso + 1;
            }
        }

        System.out.printf("Hay un total de %d suspensos", suspenso);

    }
}
