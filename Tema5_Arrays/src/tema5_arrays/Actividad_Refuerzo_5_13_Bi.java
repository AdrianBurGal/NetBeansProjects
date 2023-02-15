package tema5_arrays;

public class Actividad_Refuerzo_5_13_Bi {

    public static void rellenaEstaturas(int[][] estaturas, int minimo, int maximo) {

        for (int fila = 0; fila < estaturas.length; fila++) {
            for (int columna = 0; columna < estaturas[fila].length; columna++) {
                estaturas[fila][columna] = (int) (Math.random() * (maximo - minimo)) + minimo;
            }
        }
    }

    public static int calculaMedia(int[][] estaturas, int fila) {

        int media = 0;

        for (int columna = 0; columna < estaturas[fila].length; columna++) {
            media = media + estaturas[fila][columna];
        }
        media = media / 10;
        return media;
    }

    public static int calculaMinimo(int[][] estaturas, int fila) {

        int minimo = Integer.MAX_VALUE;

        for (int columna = 0; columna < estaturas[fila].length; columna++) {
            if (estaturas[fila][columna] < minimo) {
                minimo = estaturas[fila][columna];
            }
        }
        return minimo;
    }

    public static int calculaMaximo(int[][] estaturas, int fila) {

        int maximo = Integer.MIN_VALUE;

        for (int columna = 0; columna < estaturas[fila].length; columna++) {
            if (estaturas[fila][columna] > maximo) {
                maximo = estaturas[fila][columna];
            }
        }
        return maximo;
    }

    public static void muestraTabla(int[][] estaturas, String[] pais) {

        for (int fila = 0; fila < estaturas.length; fila++) {
            System.out.print(pais[fila] + " ");
            for (int columna = 0; columna < estaturas[0].length - 1; columna++) {
                System.out.print(estaturas[fila][columna] + " ");
            }
            System.out.print("| " + calculaMedia(estaturas, fila) + " "); //Muestra la media
            System.out.print(calculaMinimo(estaturas, fila) + " "); //Muestra la mínima estatura
            System.out.print(calculaMaximo(estaturas, fila) + " "); //Muestra la máxima estatura
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String[] pais = {"   España:", "    Rusia:", "    Japón:", "Australia:"};

        int[][] estaturas = new int[4][10];

        rellenaEstaturas(estaturas, 140, 210);
        System.out.println("\t\t\t\t\t\t MED MIN MAX");
        muestraTabla(estaturas, pais);

    }
}
