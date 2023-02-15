package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_30 {

    public static void main(String[] args) {

        int hora1, dia1, hora2, dia2, horas = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduzca la primera hora. ");
            System.out.print("Día: ");
            dia1 = teclado.nextInt();
            System.out.print("Hora: ");
            hora1 = teclado.nextInt();

            System.out.println("Introduzca la segunda hora. ");
            System.out.print("Día: ");
            dia2 = teclado.nextInt();
            System.out.print("Hora: ");
            hora2 = teclado.nextInt();

        } while (dia1 > dia2 || dia1 > 7 || dia2 > 7 || hora1 > 24 || hora2 > 24);

        horas = (dia2 - dia1) - 1 * 24;
        horas = horas + (24 - hora1);
        horas = horas + hora2;

        System.out.printf("Entre las %d:00 del día %d "
                + "y las %d:00 del día %d hay %d horas/s.\n", hora1, dia1, hora2, dia2, horas);
    }
}
