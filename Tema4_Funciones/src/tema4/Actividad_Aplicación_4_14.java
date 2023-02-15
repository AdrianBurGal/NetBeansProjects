package tema4;

import java.util.Scanner;

public class Actividad_Aplicación_4_14 {

    public static int numeroSegundos(int dia, int hora, int minuto) {

        int totalSegundos;
        
        totalSegundos = (dia * 24 * 3600) + (hora * 3600) + (minuto * 60);
       
        return totalSegundos;
    }

    public static void main(String[] args) {

        int dia, hora, minuto;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca los días: ");
        dia = teclado.nextInt();
        
        System.out.print("Introduzca la hora: ");
        hora = teclado.nextInt();

        System.out.print("Introduzca los minutos: ");
        minuto = teclado.nextInt();

        System.out.println("En total hay " + numeroSegundos(dia, hora, minuto) + " segundos.");

    }

}
