package bibliotecasArrays;

import java.util.Arrays;

public class Ordenación_Insercion_Directa {

    public static void ordenarArrayInsercionDirecta(int[] lista) {

        int valorAInsertar, recorrido;

        for (int indice = 1; indice < lista.length; indice++) {
            valorAInsertar = lista[indice];
            recorrido = indice - 1;

            while ((recorrido >= 0) && (valorAInsertar < lista[recorrido])) {

                lista[recorrido + 1] = lista[recorrido];
                recorrido--;
            }
            lista[recorrido + 1] = valorAInsertar;

        }
    }

    public static void main(String[] args) {

        int[] lista = {29, 10, 14, 37, 14, 3, 25};

        ordenarArrayInsercionDirecta(lista);
        System.out.println(Arrays.toString(lista));

    }

}
