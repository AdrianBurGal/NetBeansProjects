package tema2;

import java.util.Scanner;

public class Actividad_Refuerzo_2_11 {

    public static void main(String[] args) {

        int horas, minutos, segundos, segundosNecesarios;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime las horas: ");
        horas = teclado.nextInt() % 24;

        System.out.println("Dime los minutos: ");
        minutos = teclado.nextInt();

        segundos = horas * 3600 + minutos * 60;
        segundosNecesarios = (24 * 3600) - segundos;

        System.out.printf("Son las [%d:%d]. Faltan %d segundos para el mediodia.", horas, minutos, segundosNecesarios);

    }
}
   
       
    
