package tema5_arrays;

public class Actividad_Refuerzo_5_06_Bi {

    public static void rellenaNoRepetido(int[][] matriz, int valorMinimo, int valorMaximo) {

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = ((int) (Math.random() * (valorMaximo - valorMinimo + 1))) + valorMinimo;
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

    public static String encuentraMayor(int[][] matriz) {

        int maximo = Integer.MIN_VALUE;
        String posicion = "";

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] > maximo) {
                    maximo = matriz[fila][columna];
                    posicion = fila + "," + columna + " --> " + maximo;
                }
            }
        }
        return posicion;
    }

    public static String encuentraMenor(int[][] matriz) {

        int minimo = Integer.MAX_VALUE;
        String posicion = "";

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] < minimo) {
                    minimo = matriz[fila][columna];
                    posicion = fila + "," + columna + " --> " + minimo;
                }
            }
        }
        return posicion;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[6][10];

        rellenaNoRepetido(matriz, 100, 1000);
        muestraMatriz(matriz);
        System.out.println("\nLa posición con el número máximo es: " + encuentraMayor(matriz));
        System.out.println("La posición con el número mínimo es: " + encuentraMenor(matriz));
    }
}
