package tema5_arrays;

import java.util.Arrays;
import static tema5_arrays.BibliotecaArrays.insertarNoOrdenada;

public class Actividad_Resuelta_5_07 {

    public static int[] sinRepetidos(int[] tabla) {

        int[] nuevo = new int[1];
        boolean repetido;

        nuevo[0] = tabla[0];

        for (int indice = 1; indice < tabla.length; indice++) {

            repetido = false;

            for (int recorrido = 0; recorrido < nuevo.length; recorrido++) {

                if (tabla[indice] == nuevo[recorrido]) {
                    repetido = true;
                }
            }

            if (repetido == false) {
                nuevo = insertarNoOrdenada(nuevo, tabla[indice]);
            }
        }
        return nuevo;
    }

    public static void main(String[] args) {

        int[] tabla = {8, 2, 3, 4, 8, 3, 9};

        System.out.println(Arrays.toString(sinRepetidos(tabla)));

    }
}
