package tema2;

import java.util.Scanner;

public class Actividad_2_13 {

    public static void main(String[] args) {

        int hora, minuto, segundo, segundos_Anadidos;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la hora: ");
        hora = teclado.nextInt();
        System.out.print("Introduzca los minutos: ");
        minuto = teclado.nextInt();
        System.out.print("Introduzca los segundos: ");
        segundo = teclado.nextInt();
        System.out.print("Introduzca los segundos añadidos: ");
        segundos_Anadidos = teclado.nextInt();

        segundo = segundo + segundos_Anadidos;
        
        if (segundo > 59) {
            minuto = minuto + (segundo / 60);
            segundo = segundo % 60;
        }
        if (minuto > 59) {
            hora = hora + (minuto / 60);
            minuto = minuto % 60;
        }
        if (hora > 23) {
            hora = hora % 24;
        }
        System.out.printf("Son las [%d : %d : %d] ", hora, minuto,segundo);
    }
}
