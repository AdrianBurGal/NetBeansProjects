package bibliotecasArrays;

import java.util.Arrays;

public class Ordenacion_Array_Burbuja {

    public static void ordenarArrayBurbuja(int[] lista) {

        boolean intercambio;
        int ultimo = 0, aux;

        do {
            intercambio = false;
            for (int recorrido = 0; recorrido < lista.length - 1 - ultimo; recorrido++) {
                if (lista[recorrido] > lista[recorrido + 1]) {
                    intercambio = true;
                    aux = lista[recorrido];
                    lista[recorrido] = lista[recorrido + 1];
                    lista[recorrido + 1] = aux;
                }
            }
            ultimo++;
        } while (intercambio);
    }

    public static void main(String[] args) {

        int[] lista = {29, 10, 14, 37, 14, 3, 25};

        ordenarArrayBurbuja(lista);
        System.out.println(Arrays.toString(lista));

    }
}
