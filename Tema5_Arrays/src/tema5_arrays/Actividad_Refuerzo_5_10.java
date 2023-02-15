package tema5_arrays;

import java.util.Arrays;

public class Actividad_Refuerzo_5_10 {

    public static void main(String[] args) {

        int indice2 = 0;
        int[] lista = new int[20];
        int[] lista2 = new int[lista.length];

        for (int indice = 0; indice < lista.length; indice++) {
            lista[indice] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(lista));

        for (int indice = 0; indice < lista.length; indice++) {
            if ((lista[indice] % 2) == 0) {
                lista2[indice2] = lista[indice];
                indice2++;
            }
        }

        for (int indice = 0; indice < lista.length; indice++) {
            if ((lista[indice] % 2) != 0) {
                lista2[indice2] = lista[indice];
                indice2++;
            }
        }

        System.out.println(Arrays.toString(lista2));
    }
}
