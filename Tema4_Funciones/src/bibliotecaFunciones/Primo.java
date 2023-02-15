package bibliotecaFunciones;

public class Primo {

    public static boolean esPrimo(int numero) {

        boolean primo = true;

        for (int contador = 2; contador != numero; contador++) {
            if (numero % contador == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {

        int numero = 5;

        System.out.println(esPrimo(numero));

    }
}
