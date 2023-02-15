package tema2;

import java.util.Scanner;

public class Actividad_2_09 {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número entre [0 - 99.999]: ");
        numero = teclado.nextInt();
        
        if (numero < 0 || numero > 99999){
            System.out.println("Número introducido fuera de rango.");
        } else if (numero >= 0 && numero < 10) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero >= 10 && numero < 100) {
            System.out.println("El número tiene 2 cifras.");
        } else if (numero >= 100 && numero < 1000) {
            System.out.println("El número tiene 3 cifras.");
        } else if (numero >= 1000 && numero < 10000) {
            System.out.println("El número tiene 4 cifras.");
        } else if (numero >= 10000 && numero <= 99999) {
            System.out.println("El número tiene 5 cifras.");
   
        }
    }
        
        
    
}
