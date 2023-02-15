package tema5_arrays;

import java.util.Arrays;

public class BibliotecaArrays {

    public static int[] copiaDe(int[] origen, int longitud) {

        int[] nuevo = new int[longitud];

        for (int indice = 0; indice < longitud; indice++) {
            if (indice < origen.length) {
                nuevo[indice] = origen[indice];
            } else {
                nuevo[indice] = 0;
            }
        }
        return nuevo;
    }

    public static int[] copiaOfRange(int[] origen, int desde, int hasta) {

        int indiceNuevo = 0;

        int[] nuevo = new int[hasta - desde];

        for (int indice = desde; indice < hasta; indice++) {
            nuevo[indiceNuevo++] = origen[indice];
        }

        return nuevo;
    }

    public static int[] arrayCopia(int[] origen, int posicionOrigen, int[] destino, int posicionDestino, int longitud) {

        while (longitud > 0) {
            destino[posicionDestino++] = origen[posicionOrigen++];
            longitud--;
        }
        return destino;
    }

    public static int[] insertarNoOrdenada(int[] tabla, int elemento) {

        tabla = copiaDe(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = elemento;

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
        tabla = copia;

        return tabla;
    }

    public static int[] eliminarNoOrdenada(int[] tabla, int buscado) {

        int borrado;
        boolean encontrado = true;

        for (int indice = 0; indice < tabla.length && encontrado; indice++) {
            if (buscado == tabla[indice]) {

                borrado = tabla[indice];
                tabla[indice] = tabla[tabla.length - 1];
                tabla[tabla.length - 1] = borrado;
                encontrado = false;
            }
        }
        int[] copia = copiaDe(tabla, tabla.length - 1);
        return copia;
    }

    public static boolean compararArrays(int[] tabla1, int[] tabla2) {
        boolean resultado = true;

        if (tabla1.length != tabla2.length) {
            resultado = false;
        } else {
            for (int indice = 0; indice < tabla1.length; indice++) {
                if (tabla1[indice] != tabla2[indice]) {
                    resultado = false;
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        int[] tabla1 = {1, 2, 3, 5, 6, 7};
        int[] tabla2 = {0, 0, 0, 0, 0, 0};

        System.out.print("Función copiaDe: ");
        System.out.println(Arrays.toString(copiaDe(tabla1, 9)));

        System.out.print("\nFunción copiaOfRange: ");
        System.out.println(Arrays.toString(copiaOfRange(tabla1, 1, 4)));

        System.out.print("\nFunción arrayCopia: ");
        System.out.println(Arrays.toString(arrayCopia(tabla1, 2, tabla2, 2, 3)));

        System.out.print("\nFunción insertarNoOrdenada: ");
        System.out.println(Arrays.toString(insertarNoOrdenada(tabla1, 9)));

        System.out.print("\nFunción insertarOrdenada: ");
        System.out.println(Arrays.toString(insertarOrdenada(tabla1, 4)));

        System.out.print("\nFunción eliminarNoOrdenada: ");
        System.out.println(Arrays.toString(eliminarNoOrdenada(tabla1, 5)));

        int[] tabla3 = {0, 0, 0, 0, 0, 0};
        int[] tabla4 = {0, 0, 0, 0, 0, 0};
        System.out.print("\nFunción compararArrays: ");
        System.out.println(compararArrays(tabla3, tabla4));
    }
}
