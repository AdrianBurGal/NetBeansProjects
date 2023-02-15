package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_5_03 {

    public static void main(String[] args) {

        int veces;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el número de veces que quieres que se repita: ");
        veces = teclado.nextInt();

        int[] lista = new int[veces];

        for (int contador = 0; contador < lista.length; contador++) {
            System.out.print("Introduzca un número: ");
            lista[contador] = teclado.nextInt();
        }

        System.out.println(Arrays.toString(lista));
        for (int contador = lista.length - 1; contador >= 0; contador--) {
            System.out.println(contador + ": " + lista[contador]);
        }
    }
}
