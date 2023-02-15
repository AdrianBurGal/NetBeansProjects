package tema5_arrays;

import java.util.Scanner;

public class Actividad_Refuerzo_5_08_Bi {

    public static void rellenaTablero(int[][] matriz) {

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = 0;
            }
        }
    }

    public static void moverAlfil(int[][] tablero, int coord1, int coord2, int indice) {

        if ((coord1 - indice >= 0) && (coord2 - indice >= 0)) {
            tablero[coord1 - indice][coord2 - indice] = 1;
        }

        if ((coord1 - indice >= 0) && (coord2 + indice < 8)) {
            tablero[coord1 - indice][coord2 + indice] = 1;
        }
        if ((coord1 + indice < 8) && (coord2 - indice >= 0)) {
            tablero[coord1 + indice][coord2 - indice] = 1;
        }

        if ((coord1 + indice < 8) && (coord2 + indice < 8)) {
            tablero[coord1 + indice][coord2 + indice] = 1;
        }
    }

    public static void muestraTablero(int[][] matriz) {

        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] tablero = new int[8][8];
        int coord1, coord2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿En que posición quieres que esté el alfil? ");
        System.out.println("|(a=0)|(b=1)|(c=2)|(d=3)|(e=4)|(f=5)|(g=6)|(h=7)|\n");

        rellenaTablero(tablero);

        do {

            System.out.print("Coordenada 1 (a-h): ");
            coord1 = teclado.next().charAt(0) - 'a';

            System.out.print("Coordenada 2 (0-7): ");
            coord2 = teclado.nextInt();

        } while (coord1 < 0 || coord1 > 7 || coord2 < 0 || coord2 > 7);

        tablero[coord1][coord2] = 8; //Posición del alfil

        for (int indice = 1; indice < tablero.length; indice++) {
            moverAlfil(tablero, coord1, coord2, indice);
        }
        muestraTablero(tablero);
    }
}
