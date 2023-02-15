package Tema_3;

public class Actividad_Resuelta_3_14 {

    public static void main(String[] args) {

        int resultado = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                resultado = i * j;
                System.out.print("| " + j + " x " + i + " = " + resultado + " |");
            }
                System.out.println(" ");
        }

    }
}
