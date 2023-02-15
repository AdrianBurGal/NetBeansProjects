package Tema_3;

public class Actividad_Resuelta_3_10 {

    public static void main(String[] args) {

        int resultado = 1, numero = -1;

        for (int contador = 0; contador < 10; contador++) {

            resultado = resultado + numero;
            numero = numero + 2;

            System.out.print(numero + " ");

        }
        resultado = resultado + numero;
        System.out.println("\nLa suma de los 10 primeros números impares es " + (resultado));

    }
}