package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;
import static tema5_arrays.BibliotecaArrays.arrayCopia;

public class Actividad_Resuelta_5_09 {

    public static int[] rellenaTabla(int[] tabla, int programadores) {

        int puntuacion;

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca la puntuación de los %d primeros programadores.\n", programadores);
        for (int indice = 0; indice < 5; indice++) {
            puntuacion = teclado.nextInt();
            tabla[indice] = puntuacion;
        }

        return tabla;
    }

    public static int[] ordenarArrayBurbuja(int[] tabla) {

        boolean intercambio;
        int ultimo = 0, aux;

        do {
            intercambio = false;
            for (int recorrido = 0; recorrido < tabla.length - 1 - ultimo; recorrido++) {
                if (tabla[recorrido] > tabla[recorrido + 1]) {
                    intercambio = true;
                    aux = tabla[recorrido];
                    tabla[recorrido] = tabla[recorrido + 1];
                    tabla[recorrido + 1] = aux;
                }
            }
            ultimo++;
        } while (intercambio);

        return tabla;
    }

    public static int[] insertarOrdenada(int[] tabla, int nuevo) {

        int indiceInsercion = Arrays.binarySearch(tabla, nuevo);

        if (indiceInsercion < 0) {
            indiceInsercion = -indiceInsercion - 1;
        }

        int[] copia = new int[tabla.length + 1];
        arrayCopia(tabla, 0, copia, 0, indiceInsercion);
        arrayCopia(tabla, indiceInsercion, copia, indiceInsercion + 1, tabla.length - indiceInsercion);

        copia[indiceInsercion] = nuevo;

        return copia;
    }

    public static void main(String[] args) {

        int[] tabla = new int[5];
        int puntos;

        Scanner teclado = new Scanner(System.in);

        //Rellena tabla de los primeros programadores.
        System.out.println(Arrays.toString(rellenaTabla(tabla, 5)));

        //Ordena el array de los primeros programadores.
        System.out.println(Arrays.toString(ordenarArrayBurbuja(tabla)));

        do {
            puntos = teclado.nextInt();
            if (puntos > 0) {
                tabla = insertarOrdenada(tabla, puntos);
            }
        } while (puntos >= 0);

        System.out.println(Arrays.toString(tabla));

    }

}
