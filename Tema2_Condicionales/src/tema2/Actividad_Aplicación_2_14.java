package tema2;

import java.util.Scanner;

public class Actividad_Aplicación_2_14 {

    public static void main(String[] args) {

        int num, decena = 0, unidad = 0;
        String unidadString = null, decenaString = null;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un número comprendido entre [1-99] ");
        num = teclado.nextInt();
      
        if (num >= 30 && num <= 99)
            
            unidad = num % 10;
            decena = num / 10;
            
            switch(decena) {
                case 3 -> decenaString = "treinta";
                case 4 -> decenaString = "cuarenta";
                case 5 -> decenaString = "cincuenta";
                case 6 -> decenaString = "sesenta";
                case 7 -> decenaString = "setenta";
                case 8 -> decenaString = "ochenta";
                case 9 -> decenaString = "noventa";
            }
        
            switch(unidad) {
                case 1 -> unidadString = " y uno";
                case 2 -> unidadString = " y dos";
                case 3 -> unidadString = " y tres";
                case 4 -> unidadString = " y cuatro";
                case 5 -> unidadString = " y cinco";
                case 6 -> unidadString = " y seis";
                case 7 -> unidadString = " y siete";
                case 8 -> unidadString = " y ocho";
                case 9 -> unidadString = " y nueve";
                
            }

        System.out.println("El numero es: " + decenaString + unidadString);
        }
        
    }

