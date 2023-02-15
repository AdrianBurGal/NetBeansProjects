package tema5_arrays;

import java.util.Arrays;

public class Actividad_Resuelta_5_12 {

    public static void main(String[] args) {

        int[][] biTabla = new int[5][5];

        for (int indice1 = 0; indice1 < biTabla.length; indice1++) {
            for (int indice2 = 0; indice2 < biTabla.length; indice2++) {
                biTabla[indice1][indice2] = (10 * indice1) + indice2;
            }
        }
        System.out.println(Arrays.deepToString(biTabla));
    }
}
