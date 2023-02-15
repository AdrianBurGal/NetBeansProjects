package tema4;

import java.util.Scanner;

public class Actividad_Aplicación_4_15 {

    public static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {

        int totalMinutos;
        
        totalMinutos = Math.abs((hora1 - hora2)) * 60 + Math.abs((minuto1 - minuto2));
       
        return totalMinutos;
    }

    public static void main(String[] args) {

        int hora1, minuto1, hora2, minuto2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la hora1: ");
        hora1 = teclado.nextInt();
        
        System.out.print("Dime los minutos1: ");
        minuto1 = teclado.nextInt();

        System.out.print("Dime la hora2: ");
        hora2 = teclado.nextInt();
        
        System.out.print("Dime los minuto2: ");
        minuto2 = teclado.nextInt();

        System.out.println("Hay " + diferenciaMin(hora1, minuto1, hora2, minuto2) + " minutos.");

    }

}