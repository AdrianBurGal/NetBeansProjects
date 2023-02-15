package tema2;

import java.util.Scanner;

public class Actividad_2_05 {

    public static void main(String[] args) {

        double nota;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nota: ");
        nota = teclado.nextDouble();

        if (nota >= 0 && nota < 5) {
            System.out.println("Tienes un INSUFICIENTE en la nota.");
        } else {
            if (nota >= 5 && nota < 6) {
                System.out.println("Tienes un SUFICIENTE en la nota.");
            } else {
                if (nota >= 6 && nota < 7) {
                    System.out.println("Tienes un BIEN en la nota.");
                } else {
                    if (nota >= 7 && nota < 9) {
                        System.out.println("Tienes un NOTABLE en la nota.");
                    } else {
                        if (nota >= 9 && nota < 10) {
                            System.out.println("Tienes un SOBRESALIENTE en la nota.");
                        } else {
                            if (nota == 10) {
                                System.out.println("¡¡¡¡MATRÍCULA DE HONOR!!!!");
                            } else {

                                System.out.println("La nota introducida no está entre (0-10).");
                            }

                        }
                    }
                }
            }
        }

    }
}
