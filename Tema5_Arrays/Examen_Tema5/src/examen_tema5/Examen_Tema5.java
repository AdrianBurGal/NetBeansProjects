package examen_tema5;

import java.util.Scanner;

public class Examen_Tema5 {

    public static void rellenaTablero(int[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                tablero[fila][columna] = 0;
            }
        }
    }

    public static int introducirFicha(int[][] tabla, int numero, int numColumna, int numFila) {

        if (!compruebaOcupado(tabla, numFila, numColumna)) {
            tabla[numFila - 1][numColumna - 1] = numero;
        } else {
            do {
                numFila--;
            } while (compruebaOcupado(tabla, numFila, numColumna));
            tabla[numFila - 1][numColumna - 1] = numero;
        }
        return numFila;
    }

    public static boolean compruebaOcupado(int[][] tabla, int numFila, int numColumna) {

        boolean ocupado = false;
        if (tabla[numFila - 1][numColumna - 1] != 0) {
            ocupado = true;
        }
        return ocupado;
    }

    public static void intercambiaFicha(int[][] tablero, int jugador, int oponente, int fila, int columna) {

        if (fila > tablero.length && columna > tablero[0].length && tablero[fila - 1][columna - 1] == oponente) {
            tablero[fila - 1][columna - 1] = jugador;
        }
        if (fila > tablero.length && tablero[fila - 1][columna] == oponente) {
            tablero[fila - 1][columna] = jugador;
        }
        if (fila > tablero.length && columna < tablero[0].length - 1 && tablero[fila - 1][columna + 1] == oponente) {
            tablero[fila - 1][columna + 1] = jugador;
        }
        if (columna > tablero[0].length && tablero[fila][columna - 1] == oponente) {
            tablero[fila][columna - 1] = jugador;
        }
        if (columna < tablero[0].length - 1 && tablero[fila][columna + 1] == oponente) {
            tablero[fila][columna + 1] = jugador;
        }
        if (fila < tablero.length - 1 && columna > tablero[0].length && tablero[fila + 1][columna - 1] == oponente) {
            tablero[fila + 1][columna - 1] = jugador;
        }
        if (fila < tablero.length - 1 && tablero[fila + 1][columna] == oponente) {
            tablero[fila + 1][columna] = jugador;
        }
        if (fila < tablero.length - 1 && columna < tablero[0].length - 1 && tablero[fila + 1][columna + 1] == oponente) {
            tablero[fila + 1][columna + 1] = jugador;
        }
    }

    public static void muestraTablero(int[][] tablero) {

        for (int indice = 1; indice <= tablero[0].length; indice++) {
            System.out.printf("%d ", indice);
        }
        System.out.println();

        for (int[] fila : tablero) {
            for (int columna : fila) {
                System.out.print(muestraFichaTablero(columna) + " ");
            }
            System.out.println();
        }
    }

    public static String muestraFichaTablero(int ficha) {

        String casilla = ".";

        if (ficha == 1) {
            casilla = "R";
        } else if (ficha == 2) {
            casilla = "A";
        }
        return casilla;
    }

    public static void main(String[] args) {

        int fila, columna, posicionColumna, contador = 0, posicionFila;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca el número de filas del tablero: ");
            fila = teclado.nextInt();

            System.out.print("Introduzca el número de columnas del tablero: ");
            columna = teclado.nextInt();
        } while (fila < 4 || columna < 4 || fila > 8 || columna > 8);

        int[][] tablero = new int[fila][columna];

        rellenaTablero(tablero);
        muestraTablero(tablero);

        do {
            System.out.print("JUGADOR 1, dime la columna para poner tu ficha ROJA(R): ");
            posicionColumna = teclado.nextInt();

            if (posicionColumna > columna || posicionColumna < 1) {
                System.out.println("Turno perdido");
                contador++;
                muestraTablero(tablero);
            } else {
                posicionFila = introducirFicha(tablero, 1, posicionColumna, fila);
                intercambiaFicha(tablero, 1, 2, posicionFila - 1, posicionColumna - 1);
                muestraTablero(tablero);
                contador++;
            }

            System.out.print("JUGADOR 2, dime la columna para poner tu ficha AZUL(A): ");
            posicionColumna = teclado.nextInt();

            if (posicionColumna > columna || posicionColumna < 1) {
                System.out.println("Turno perdido");
                contador++;
                muestraTablero(tablero);
            } else {
                posicionFila = introducirFicha(tablero, 2, posicionColumna, fila);
                intercambiaFicha(tablero, 2, 1, posicionFila - 1, posicionColumna - 1);
                muestraTablero(tablero);
                contador++;
            }

        } while (contador < fila * columna);
    }
}
