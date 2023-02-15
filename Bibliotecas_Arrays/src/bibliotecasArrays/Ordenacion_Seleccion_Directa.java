package bibliotecasArrays;

import java.util.Arrays;

public class Ordenacion_Seleccion_Directa {

    public static void ordenarArraySeleccionDirecta(int[] lista) {

        int indiceMenor, aux;
        
        for (int indice = 0; indice < lista.length-1; indice++) {

            indiceMenor = indice;

            for (int recorrido = indice + 1; recorrido < lista.length; recorrido++) {
                if (lista[recorrido] < lista[indiceMenor]) {
                    indiceMenor = recorrido;
                }
            }
            aux = lista[indiceMenor];
            lista[indiceMenor] = lista[indice];
            lista[indice] = aux;
        }
    }

    public static void main(String[] args) {

        int[] lista = {29, 10, 14, 37, 14, 3, 25};
        System.out.println("Lista no ordenada: " + Arrays.toString(lista));
        ordenarArraySeleccionDirecta(lista);
        System.out.println("Lista ordenada:    " + Arrays.toString(lista));

    }

}
