package tema2;

import java.util.Scanner;

public class Actividad_2_07 {

    public static void main(String[] args) {

        double num1, num2, num3;
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Introduzca el primer número: ");
        num1 = teclado.nextDouble();
        
        System.out.print("Introduzca el segundo número: ");
        num2 = teclado.nextDouble();
        
        System.out.print("Introduzca el tercer número: ");
        num3 = teclado.nextDouble();

        if (num1 > num2 && num2 > num3) {
            System.out.printf("Ordenado de mayor a menor sería: %f, %f, %f", num1, num2, num3);       
            } else if (num1 > num3 && num3 > num2){
                System.out.printf("Ordenado de mayor a menor sería: %f, %f, %f", num1, num3, num2);
            } else if (num2 > num1 && num1 > num3){
                System.out.printf("Ordenado de mayor a menor sería: %f, %f, %f", num2, num1, num3);
            } else if (num2 > num3 && num3 > num1){
                System.out.printf("Ordenado de mayor a menor sería: %f, %f, %f", num2, num3, num1);
            } else if (num3 > num1 && num1 > num2){
                System.out.printf("Ordenado de mayor a menor sería: %f, %f, %f", num3, num1, num2);
            } else if (num3 > num2 && num2 > num1){  
                System.out.printf("Ordenado de mayor a menor sería: %f, %f, %f", num3, num2, num1);
        }
    }
}
