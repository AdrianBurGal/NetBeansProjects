package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Refuerzo_5_06 {

    public static void main(String[] args) {

        int numero, aux;

        Scanner teclado = new Scanner(System.in);

        //int[] lista = new int[15];
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        /*for (int contador = 0; contador < lista.length; contador++) {
            System.out.print("Introduzca un número: ");
            numero = teclado.nextInt();
            lista[contador] = numero;
        }*/
        
        System.out.println("Array inicial: " + Arrays.toString(lista));

        int[] lista2 = new int[lista.length];

        for (int indice = 0; indice < lista.length - 1; indice++) {
            aux = lista[lista.length - 1];
            lista2[indice + 1] = lista[indice];
            lista2[0] = aux;
        }
        System.out.println("Array final:   " + Arrays.toString(lista2));

    }

}
