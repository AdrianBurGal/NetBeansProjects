package tema5_arrays;

import java.util.Scanner;

public class Actividad_Examen {

    public static int generaAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo) + minimo);
    }

    public static int introducirNumero(int[][] tabla, int numero, int numColumna) {

        int numFila = 0;

        if (!compruebaOcupado(tabla, numFila, numColumna)) {
            tabla[numFila][numColumna - 1] = numero;
        } else {
            do {
                numFila++;
            } while (compruebaOcupado(tabla, numFila, numColumna));
            tabla[numFila][numColumna - 1] = numero;
        }
        return numFila;
    }

    public static boolean compruebaOcupado(int[][] tabla, int numFila, int numColumna) {

        boolean ocupado = false;
        if (tabla[numFila][numColumna - 1] != 0) {
            ocupado = true;
        }
        return ocupado;
    }

    public static boolean compruebaFilaOrdenada(int[][] tabla, int fila, int columna) {

        boolean res = true;

        if (tabla[fila][columna + 1] != 0 && tabla[fila][columna] > tabla[fila][columna + 1]) {
            res = false;
        }

        if (res && tabla[fila][columna - 1] != 0 && tabla[fila][columna] < tabla[fila][columna - 1]) {
            res = false;
        }

        return res;
    }

    public static void rellenaTabla(int[][] tabla) {

        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla[0].length; columna++) {
                tabla[fila][columna] = 0;
            }
        }
    }

    public static void mostrarTabla(int[][] tabla) {
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla[0].length; columna++) {
                System.out.print("| " + tabla[fila][columna] + " ");
            }
            System.out.println("|");
        }
        mostrarNumColumnaTabla(tabla[0].length);
    }

    public static void mostrarNumColumnaTabla(int columnas) {
        System.out.println("-----------------");
        for (int contador = 1; contador <= columnas; contador++) {
            System.out.printf("|C%d ", contador);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int totalColumna, numColumna, numero, contador = 0, numFila;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca el número de columna (4-6): ");
            totalColumna = teclado.nextInt();
        } while (totalColumna < 4 || totalColumna > 6);

        int[][] tabla = new int[5][totalColumna];

        rellenaTabla(tabla);

        do {
            mostrarTabla(tabla);

            numero = generaAleatorio(1, 10);

            System.out.println("\nDebe colocar el número " + numero);
            do {
                System.out.printf("Introduzca la columna (1-%d) donde quiere introducir el número %d: ", totalColumna, numero);
                numColumna = teclado.nextInt();
            } while (numColumna < 1 || numColumna > totalColumna);

            numFila = introducirNumero(tabla, numero, numColumna);

        } while (compruebaFilaOrdenada(tabla, numFila, numColumna));
//contador < (5 * totalColumna) && 
    }
}
