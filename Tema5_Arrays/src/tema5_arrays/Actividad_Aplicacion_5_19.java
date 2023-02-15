package tema5_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Aplicacion_5_19 {

    public static void main(String[] args) {

        int dorsal = 0, dorsalMenor;
        int[] lista = new int[5];

        Scanner teclado = new Scanner(System.in);

        for (int indice = 0; indice < lista.length; indice++) {
            System.out.print("Introduzca el nº de dorsal: ");
            dorsal = teclado.nextInt();
            lista[indice] = dorsal;
        }
        
        System.out.println(Arrays.toString(lista));
        
        for (int indiceAntidopaje = 0; indiceAntidopaje < lista.length; indiceAntidopaje++) {
            System.out.print("Introduzca el nº de dorsal de los menores de edad: ");
            dorsalMenor = teclado.nextInt();
            
            if (dorsal == dorsalMenor){
                
                
            }
            
        }

    }

}
