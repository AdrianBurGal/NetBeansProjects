package tema2;

import java.util.Scanner;

public class Actividad_Aplicación_2_12 {
    
    public static void main(String[] args) {
        
        int dni, letra;
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Introduzca su DNI sin la letra: ");
        dni = teclado.nextInt();
        
        letra = dni % 23;
        switch (letra){
            case 0 -> System.out.println("La letra de su DNI será la T.");
            case 1 -> System.out.println("La letra de su DNI será la R.");
            case 2 -> System.out.println("La letra de su DNI será la W.");
            case 3 -> System.out.println("La letra de su DNI será la A.");
            case 4 -> System.out.println("La letra de su DNI será la G.");
            case 5 -> System.out.println("La letra de su DNI será la M.");
            case 6 -> System.out.println("La letra de su DNI será la Y.");
            case 7 -> System.out.println("La letra de su DNI será la F.");
            case 8 -> System.out.println("La letra de su DNI será la P.");
            case 9 -> System.out.println("La letra de su DNI será la D.");
            case 10 -> System.out.println("La letra de su DNI será la X.");
            case 11 -> System.out.println("La letra de su DNI será la B.");
            case 12 -> System.out.println("La letra de su DNI será la N.");
            case 13 -> System.out.println("La letra de su DNI será la J.");
            case 14 -> System.out.println("La letra de su DNI será la Z.");
            case 15 -> System.out.println("La letra de su DNI será la S.");
            case 16 -> System.out.println("La letra de su DNI será la Q.");
            case 17 -> System.out.println("La letra de su DNI será la V.");
            case 18 -> System.out.println("La letra de su DNI será la H.");
            case 19 -> System.out.println("La letra de su DNI será la L.");
            case 20 -> System.out.println("La letra de su DNI será la C.");
            case 21 -> System.out.println("La letra de su DNI será la K.");
            case 22 -> System.out.println("La letra de su DNI será la E.");
            
            default -> System.out.println("DNI no válido.");
        }
    }
        
}
