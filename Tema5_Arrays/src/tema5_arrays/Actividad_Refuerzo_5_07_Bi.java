package tema5_arrays;

import java.util.Scanner;

public class Actividad_Refuerzo_5_07_Bi {

    public static void rellenaTablero(int[][] matriz) {

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = 0;
            }
        }
    }

    public static void creaMina(int[][] mina) {

        int fila = (int) (Math.random() * mina.length);
        int columna = (int) (Math.random() * mina[fila].length);

        mina[fila][columna] = 1;
    }

    public static void creaTesoro(int[][] tesoro) {

        int fila = (int) (Math.random() * tesoro.length);
        int columna = (int) (Math.random() * tesoro[fila].length);

        tesoro[fila][columna] = 2;
    }

    public static void muestraTablero(int[][] matriz) {

        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    public static boolean comprueba(int[][] tablero, int coord1, int coord2, int tamano) {

        boolean jugar = true;
        int contMina = 0;

        if (tablero[coord1][coord2] == 2) {
            System.out.println("¡¡¡Enhorabuena, has encontrado el tesoro!!!");
        } else if (tablero[coord1][coord2] == 1) {
            System.out.println("Has perdido, mina encontrada :(");
            jugar = false;
        } else if (jugar) {

            if (coord1 < tamano - 1 && coord2 < tamano - 1 && tablero[coord1 + 1][coord2 + 1] == 1) {
                contMina++;
            }
            if (coord1 < tamano - 1 && tablero[coord1 + 1][coord2] == 1) {
                contMina++;
            }
            if (coord1 < tamano - 1 && coord2 > 0 && tablero[coord1 + 1][coord2 - 1] == 1) {
                contMina++;
            }
            if (coord2 < tamano - 1 && tablero[coord1][coord2 + 1] == 1) {
                contMina++;
            }
            if (coord2 > 0 && tablero[coord1][coord2 - 1] == 1) {
                contMina++;
            }
            if (coord1 > 0 && coord2 < tamano - 1 && tablero[coord1 - 1][coord2 + 1] == 1) {
                contMina++;
            }
            if (coord1 > 0 && tablero[coord1 - 1][coord2] == 1) {
                contMina++;
            }
            if (coord1 > 0 && coord2 > 0 && tablero[coord1 - 1][coord2 - 1] == 1) {
                contMina++;
            }
            System.out.printf("¡Cuidado!¡Hay %d mina(s) cerca!\n\n", contMina);
        }
        return jugar;
    }

    public static void main(String[] args) {

        int coord1, coord2, numMinas, tamano;
        boolean jugar;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¡Bienvenido al BuscaTesoroWars! Indica el tamaño del tablero: ");
        tamano = teclado.nextInt();

        System.out.print("¿Cuántas minas quieres añadir? ");
        numMinas = teclado.nextInt();

        int[][] tablero = new int[tamano][tamano];

        rellenaTablero(tablero);

        for (int contador = 0; contador < numMinas; contador++) {
            creaMina(tablero);
        }
        creaTesoro(tablero);

        System.out.printf("Se creó un tablero de %d x %d con %d minas y 1 tesoro.\n\n", tamano, tamano, numMinas);

        do {
            muestraTablero(tablero);
            
            do {
                System.out.print("\nCOORDENADA1: ");
                coord1 = teclado.nextInt();

                System.out.print("COORDENADA2: ");
                coord2 = teclado.nextInt();
            } while ((coord1 > tamano-1) || (coord2 > tamano-1));
            
            jugar = comprueba(tablero, coord1, coord2, tamano);

        } while (tablero[coord1][coord2] != 2 && jugar);

    }
}