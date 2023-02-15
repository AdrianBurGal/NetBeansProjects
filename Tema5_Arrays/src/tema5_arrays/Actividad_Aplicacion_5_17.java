package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Aplicacion_5_17 {

    public static void main(String[] args) {

        int[] lista = {10, 1, 5, 8, 9, 2};
        int numElemento;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos elementos quieres agrupar? ");

        do {
            numElemento = teclado.nextInt();
        } while ((numElemento <= 0) || (numElemento > lista.length));

        int[] listaSuma = new int[lista.length - numElemento + 1];

        for (int indice = 0; indice < lista.length - numElemento + 1; indice++) {

            for (int recorrido = indice; recorrido < numElemento + indice; recorrido++) {

                listaSuma[indice] = listaSuma[indice] + lista[recorrido];
            }
        }

        System.out.println(Arrays.toString(listaSuma));
    }

}
