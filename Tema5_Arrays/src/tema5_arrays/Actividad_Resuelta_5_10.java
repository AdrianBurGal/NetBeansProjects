package tema5_arrays;

import java.util.Arrays;
import static tema5_arrays.BibliotecaArrays.copiaDe;

public class Actividad_Resuelta_5_10 {

    public static int[] eliminarMayores(int[] tabla, int valor) {

        int numMayores = 0;

        for (int indice = 0; indice < tabla.length; indice++) {
            if (valor < tabla[indice]) {
                numMayores++;
            }
        }
        
        int[] copia = copiaDe(tabla, tabla.length-numMayores);
        return copia;
    }

    public static void main(String[] args) {

        int[] tabla = {1, 2, 3, 4, 5, 6};
        
        System.out.print("Array original: ");
        System.out.println(Arrays.toString(tabla));
        
        System.out.print("\nFunción eliminarMayores: ");
        System.out.println(Arrays.toString(eliminarMayores(tabla, 3)));
        
    }
}
