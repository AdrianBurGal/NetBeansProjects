
package tema2;

import java.util.Scanner;

public class Actividad_Propuesta_2_05 {
    
    public static void main(String[] args) {
        
        double dinero, precio_Entrada;
        int aforo_Maximo, n_Entradas;
        
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("¿Cuántas personas entran en el local? ");
        aforo_Maximo = teclado.nextInt();
        
        System.out.print("¿Cuánto cuesta una entrada? ");
        precio_Entrada = teclado.nextDouble();
        
        System.out.print("¿Cuántas entradas se han vendido? ");
        n_Entradas = teclado.nextInt();
        
        if (n_Entradas <= (aforo_Maximo * 0.2)){
            System.out.println("El concierto será cancelado, no supera el 20% del aforo.");
        } else if (n_Entradas <= (aforo_Maximo * 0.5)){
            dinero = n_Entradas * precio_Entrada * 0.75;
            System.out.println("El dinero recaudado con el 25% rebajado será de: " + dinero + " €.");
        } else {
            dinero = n_Entradas * precio_Entrada;
            System.out.println("El dinero recaudado será de: " + dinero + " €.");
            
        }
           
    }
}
