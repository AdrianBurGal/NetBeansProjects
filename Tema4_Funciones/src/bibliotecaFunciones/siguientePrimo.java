package bibliotecaFunciones;

public class siguientePrimo {

    public static boolean siguientePrimo(int numero) {

        boolean primo = true;

        for (int contador = 2; contador != numero; contador++) {
            if (numero % contador == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {

        int numero = 8;

        System.out.println(siguientePrimo(numero));

    }
}
