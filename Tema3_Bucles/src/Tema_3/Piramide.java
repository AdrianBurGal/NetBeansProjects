package Tema_3;

public class Piramide {

    public static void main(String[] args) {

        final int ALTURA = 6;

        for (int fila = 0; fila < ALTURA; fila++) {
            for (int blancosE = 1; blancosE <= ALTURA - fila; blancosE++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int interior = 1; interior <= (2 * fila - 1); interior++) {
                if (fila != ALTURA - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if (fila != 0) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
