package tema2;

import java.util.Scanner;

public class Actividad_2_11 {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número entre [1-7]: ");
        numero = teclado.nextInt();

        switch (numero) {
            case 1 -> System.out.println("Lunes.");
            case 2 -> System.out.println("Martes.");
            case 3 -> System.out.println("Miércoles.");
            case 4 -> System.out.println("Jueves.");
            case 5 -> System.out.println("Viernes.");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número fuera de rango.");
        }
    }

}
