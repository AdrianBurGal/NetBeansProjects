package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_Multiplicación_Rusa {

    public static void main(String[] args) {

        int multiplicador, multiplicando, resultado = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca multiplicador: ");
            multiplicador = teclado.nextInt();

            System.out.print("Introduzca multiplicando: ");
            multiplicando = teclado.nextInt();

        } while (multiplicador < 0 || multiplicando < 0);

        while (multiplicador >= 1) {

            if (multiplicador % 2 != 0) {
                resultado = resultado + multiplicando;
            }

            multiplicando = multiplicando * 2;
            multiplicador = multiplicador / 2;

        }

        System.out.println("Resultado: " + resultado);

    }
}
