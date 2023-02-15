package tema2;

import java.util.Scanner;

public class Actividad_Aplicación_2_19 {

    public static void main(String[] args) {

        int grados;
        double radianes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos mide el ángulo? ");
        grados = teclado.nextInt();

        if (grados >= 0) {
            grados = grados % 360;
            radianes = 3.1416 * grados / 180;

        } else {
            grados = grados % 360;
            grados = grados + 360;
            radianes = 3.1416 * grados / 180;
        }
        System.out.printf("Los %.2f grados son %.3f radianes", grados, radianes);
    }
    
}
