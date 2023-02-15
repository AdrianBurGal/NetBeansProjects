package Tema_3;

import java.util.Scanner;

public class Actividad_Refuerzo_3_24 {

    public static void main(String[] args) {

        int altura, contador = 0, columna2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide: ");
        altura = teclado.nextInt();

        for (int fila = 1; fila <= altura; fila++) {
            for (int blancos = 1; blancos <= (altura - fila); blancos++) {
                System.out.print(" ");
            }
            for (int columna = 1; columna <= (2 * fila - 1); columna++) {
                if (columna <= fila) {
                    System.out.print(columna % 10);
                    contador = 0;
                } else {
                    contador++;
                    System.out.print((columna - 2 * contador) % 10);
                }
            }
                System.out.println();
        }
    }
}
