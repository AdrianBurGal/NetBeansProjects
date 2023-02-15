package tema2;

import java.util.Scanner;

public class Actividad_2_10 {

    public static void main(String[] args) {

        int nota;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca su nota: ");
        nota = teclado.nextInt();

        switch (nota) {
            case 0,1,2,3,4 -> {
                System.out.println("Tienes un INSUFICIENTE en la nota.");
            }
            case 5 -> {
                System.out.println("Tienes un SUFICIENTE en la nota.");
            }
            case 6 -> {
                System.out.println("Tienes un BIEN en la nota.");
            }
            case 7,8 -> {
                System.out.println("Tienes un NOTABLE en la nota.");
            }
            case 9 -> {
                System.out.println("Tienes un SOBRESALIENTE en la nota.");
            }
            case 10 -> {
                System.out.println("¡¡¡¡MATRÍCULA DE HONOR!!!!");
            }
            default -> {
                System.out.println("Nota fuera de rango.");
            }
        }
    }

}
