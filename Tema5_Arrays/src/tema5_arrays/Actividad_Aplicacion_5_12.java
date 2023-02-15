package tema5_arrays;

import java.util.Arrays;

public class Actividad_Aplicacion_5_12 {

    public static void desordenar(int lista[]) {

        int posicion, aux;

        int[] lista2 = new int[lista.length];
        
        for (int contador = 0; contador < lista.length; contador++) {

            posicion = (int) (Math.random() * lista.length - 1);

            aux = lista[contador];
            lista2[posicion] = lista[contador];
            lista[contador] = aux;
        }
    }

    public static void main(String[] args) {

        int[] lista = {29, 10, 14, 37, 14, 3, 25};
        
        int[] lista2 = new int[lista.length];
        
        desordenar(lista);
        System.out.println(Arrays.toString(lista2));
        
    }

}
