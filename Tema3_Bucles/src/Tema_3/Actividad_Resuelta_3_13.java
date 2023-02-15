package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_13 {

    public static void main(String[] args) {

        double nota = 0;
        int suspenso = 0, aprobado = 0, condicionado = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca 6 notas: ");

        for (int contador = 1; contador <= 6; contador++) {
            nota = teclado.nextDouble();

            if (nota < 5) {
                suspenso = suspenso + 1;
            } else {
                aprobado = aprobado + 1;
            }

            if ((nota == 4) && (nota < 5)) {
                condicionado = condicionado + 1;
            }

        }
        System.out.printf("Hay un total de %d aprobados, %d suspensos "
                + "y %d condicionados con un 4 de nota.", aprobado, suspenso, condicionado);
    }
}
