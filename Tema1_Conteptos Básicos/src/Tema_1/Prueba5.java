package Tema_1;

import java.util.Scanner;

public class Prueba5 {
    
    public static void main(String[] args) {

        String nombre, apellido1, apellido2;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca su nombre completo: ");
        nombre = teclado.next();
        apellido1 = teclado.next();
        apellido2 = teclado.next();

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su primer apellido es: " + apellido1);
        System.out.println("Su segundo apellido es: " + apellido2);
    }
}
