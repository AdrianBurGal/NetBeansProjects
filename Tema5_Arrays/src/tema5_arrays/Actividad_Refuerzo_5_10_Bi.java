package tema5_arrays;

import java.util.Scanner;

public class Actividad_Refuerzo_5_10_Bi {

    public static void rellenaTablero(int[][] tablero) {

        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = 0;
            }
        }
    }

    public static int[][] creaFicha(int[][] ficha, int valor) {

        int x, y;
        boolean ocupado;

        Scanner teclado = new Scanner(System.in);

        do {
            do {
                System.out.print("Coordenada1(x): ");
                x = teclado.nextInt();

                System.out.print("Coordenada2(y): ");
                y = teclado.nextInt();
            } while (x < 0 || x > (ficha.length - 1) || y < 0 || y > (ficha.length - 1));

            ocupado = compruebaCasillaOcupada(ficha, x, y);

        } while (ocupado);

        ficha[x][y] = valor;

        return ficha;
    }

    public static boolean compruebaCasillaOcupada(int[][] casilla, int coord1, int coord2) {

        boolean casillaOcupada = false;

        if (casilla[coord1][coord2] == 1 || casilla[coord1][coord2] == 2) {
            casillaOcupada = true;
            System.out.println("\nCasilla ocupada, elige otra casilla.");
        }
        return casillaOcupada;
    }

    public static boolean compruebaGanador(int[][] ficha, int valor) {

        int x = 0, y = 0;
        boolean ganador = false;

        if (ficha[x][y] == valor && ficha[x + 1][y] == valor && ficha[x + 2][y] == valor) {
            ganador = true;
        }
        if (ficha[x][y + 1] == valor && ficha[x + 1][y + 1] == valor && ficha[x + 2][y + 1] == valor) {
            ganador = true;
        }
        if (ficha[x][y + 2] == valor && ficha[x + 1][y + 2] == valor && ficha[x + 2][y + 2] == valor) {
            ganador = true;
        }
        if (ficha[x][y] == valor && ficha[x][y + 1] == valor && ficha[x][y + 2] == valor) {
            ganador = true;
        }
        if (ficha[x + 1][y] == valor && ficha[x + 1][y + 1] == valor && ficha[x + 1][y + 2] == valor) {
            ganador = true;
        }
        if (ficha[x + 2][y] == valor && ficha[x + 2][y + 1] == valor && ficha[x + 2][y + 2] == valor) {
            ganador = true;
        }
        if (ficha[x][y] == valor && ficha[x + 1][y + 1] == valor && ficha[x + 2][y + 2] == valor) {
            ganador = true;
        }
        if (ficha[x][y + 2] == valor && ficha[x + 1][y + 1] == valor && ficha[x + 2][y] == valor) {
            ganador = true;
        }
        return ganador;
    }

    public static String muestraFicha(int ficha) {

        String casilla = "∙ ";

        if (ficha == 1) {
            casilla = "X";
        } else if (ficha == 2) {
            casilla = "○";
        }
        return casilla;
    }

    public static void muestraTablero(int[][] tablero) {

        for (int[] fila : tablero) {
            for (int columna : fila) {
                System.out.print(muestraFicha(columna) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] tablero = new int[3][3];
        int[][] ficha;
        int casillasOcupadas = 0;
        boolean ganador;

        rellenaTablero(tablero);
        muestraTablero(tablero);

        do {

            System.out.println("\nIntroduzca su ficha, JUGADOR1(X)");
            ficha = creaFicha(tablero, 1);
            ganador = compruebaGanador(ficha, 1);
            muestraTablero(tablero);
            casillasOcupadas++;

            if (!ganador) {

                System.out.println("\nIntroduzca su ficha, JUGADOR2(O)");
                ficha = creaFicha(tablero, 2);
                ganador = compruebaGanador(ficha, 2);
                muestraTablero(tablero);
                casillasOcupadas++;
            }

        } while (!ganador && casillasOcupadas < 9);
    }
}
