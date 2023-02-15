package tema5_arrays;

import java.util.Scanner;

public class Actividad_Aplicacion_5_18 {

    public static void rellenaMatriz(int[][] matriz) {

        Scanner teclado = new Scanner(System.in);

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                //matriz[fila][columna] = (int) (Math.random() * 5 + 1);
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    public static void muestraMatriz(int[][] matriz) {

        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        int totalFila, totalColumna, filaAnterior = 0, columnaAnterior;
        boolean matrizMagica = true;

        rellenaMatriz(matriz);

        for (int fila = 0; fila < matriz.length && matrizMagica; fila++) {
            totalFila = 0;
            for (int columna = 0; columna < matriz.length && matrizMagica; columna++) {
                totalFila = totalFila + matriz[fila][columna];
            }

            if ((filaAnterior != totalFila) && (fila != 0)) {
                matrizMagica = false;
            }
            filaAnterior = totalFila;
        }

        for (int columna = 0; columna < matriz.length && matrizMagica; columna++) {
            totalColumna = 0;
            for (int fila = 0; fila < matriz.length && matrizMagica; fila++) {
                totalColumna = totalColumna + matriz[fila][columna];
            }

            if ((filaAnterior != totalColumna) && (columna != 0)) {
                matrizMagica = false;
            }
            columnaAnterior = totalColumna;
        }

        muestraMatriz(matriz);
        System.out.println("Es matriz mágica? " + matrizMagica);
    }
}
