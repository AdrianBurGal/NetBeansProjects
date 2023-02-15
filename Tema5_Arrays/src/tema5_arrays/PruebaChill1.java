package tema5_arrays;

import java.util.Arrays;

public class PruebaChill1 {

    public static void main(String[] args) {

        int[][] numero = new int[10][10];
        boolean[] tabla = new boolean[10];
        
        Arrays.fill(tabla, false);
        
        for (int indice = 0; indice < 10; indice++) {
            for (int indice2 = 0; indice2 < 10; indice2++) {
                numero[indice][indice2] = (int) ((Math.random() * 20) + 1);
                
            }
        }

    }

}
