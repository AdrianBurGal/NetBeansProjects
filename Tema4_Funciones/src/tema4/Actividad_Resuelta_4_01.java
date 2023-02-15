package tema4;

import java.util.Scanner;

public class Actividad_Resuelta_4_01 {

    static void eco(int veces) {

        for (int contador = 1; contador <= veces; contador++) {
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {

        int veces;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca las veces que se repita: ");
        veces = teclado.nextInt();

        eco(veces);

    }

}
