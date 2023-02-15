package bibliotecasArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Busqueda_Array_Ordenado {

    public static void rellenaArray(int[] lista, int total) {
        for (int contador = 0; contador < total - 1; contador++) {
            lista[contador] = (int) (Math.random() * 10);
        }
    }

    public static int busquedaArrayOrdenado(int[] lista, int numero) {

        int inicio = 0, encontrado = -1;
        int fin = lista.length - 1, mitad, valor;

        while ((inicio <= fin) && (encontrado == -1)) {

            mitad = (inicio + fin) / 2;
            valor = lista[mitad];

            if (numero == valor) {
                encontrado = mitad;
            } else if (numero < valor) {
                fin = mitad - 1;
            } else if (numero > valor) {
                inicio = mitad + 1;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {

        int total, numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres guardar? ");
        total = teclado.nextInt();

        System.out.print("¿Qué número quieres buscar? ");
        numero = teclado.nextInt();

        int[] lista = new int[total];

        rellenaArray(lista, total);
        System.out.println(Arrays.toString(lista));
        System.out.println(busquedaArrayOrdenado(lista, numero));

    }
}
