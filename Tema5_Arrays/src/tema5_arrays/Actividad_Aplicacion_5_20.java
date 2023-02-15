package tema5_arrays;

import java.util.Arrays;

public class Actividad_Aplicacion_5_20 {

    public static void main(String[] args) {

        int[] lista1 = {1, 3, 7, 12, 15};
        int[] lista2 = {2, 7, 15, 40, 50};
        int indice1 = 0, indice2 = 0, indice3 = 0;

        int[] listaFinal = new int[lista1.length + lista2.length];

        System.out.println("Lista1: " + Arrays.toString(lista1));
        System.out.println("Lista2: " + Arrays.toString(lista2));

        while (indice1 < lista1.length && indice2 < lista2.length) {
            if (lista1[indice1] <= lista2[indice2]) {
                listaFinal[indice3] = lista1[indice1];
                indice1++;
            } else {
                listaFinal[indice3] = lista2[indice2];
                indice2++;
            }
            indice3++;
        }

        if (indice1 >= lista1.length) {
            while (indice2 < lista2.length){            
                listaFinal[indice3++] = lista2[indice2++];
            }
        }

        if (indice2 >= lista2.length) {
            while (indice1 < lista1.length){            
                listaFinal[indice3++] = lista1[indice1++];
            }
        }
        
        System.out.println("Lista final: " + Arrays.toString(listaFinal));
    }
}
