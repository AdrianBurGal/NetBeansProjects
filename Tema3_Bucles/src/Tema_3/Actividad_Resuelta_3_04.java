package Tema_3;

import java.util.Scanner;

public class Actividad_Resuelta_3_04 {

    public static void main(String[] args) {

        int altura = 0, alturaMayor = 0;
        int contador = 0, etiquetaMayor = 0;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura (cm): ");
        altura = teclado.nextInt();

        while (altura <= -1) {

            contador = contador + 1;
            
            if (altura > alturaMayor) {
                alturaMayor = altura;
                etiquetaMayor = contador;
            }

            System.out.print("Introduzca la altura (cm): ");
            altura = teclado.nextInt();

        }
        
        System.out.println("El árbol mayor mide " + alturaMayor + " cm.");
        System.out.println("Su etiqueta será la número " + etiquetaMayor);
    }
}
