package Tema_1;

import java.util.Scanner;

public class Prueba3 {
    
        public static void main(String[] args) {

// Prueba 3
        String nombre, apellidos;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca su nombre: ");
        nombre = entrada.next();
        apellidos = entrada.nextLine();
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Sus apellidos son: " + apellidos);
        
        
    }
}
