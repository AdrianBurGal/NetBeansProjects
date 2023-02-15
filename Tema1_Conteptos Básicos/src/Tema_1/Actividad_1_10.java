
package Tema_1;

import java.util.Scanner;
        
public class Actividad_1_10 {
    
    public static void main(String[] args) {
        
        boolean lluvia, tareasFinalizadas, irBiblioteca;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Está lloviendo? [True] [False]");
        lluvia = teclado.nextBoolean();
        
        System.out.println("¿Has terminado tus tareas? [True] [False]");
        tareasFinalizadas = teclado.nextBoolean();
        
        System.out.println("¿Quieres ir a la biblioteca? [True] [False]");
        irBiblioteca = teclado.nextBoolean();
        
        boolean salir;        
        salir = irBiblioteca || !lluvia && tareasFinalizadas;
        
        System.out.println("Podría salir? " + salir);
    }
}
