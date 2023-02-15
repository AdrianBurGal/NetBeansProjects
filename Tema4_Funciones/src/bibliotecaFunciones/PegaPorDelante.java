package bibliotecaFunciones;

public class PegaPorDelante {

    public static int pegaPorDelante(int numero, int digito) {

        int aux = numero, longitud = 0, numeroFinal;

        while (aux > 0) {
            aux = aux / 10;
            longitud++;
        }

        numeroFinal = digito * (int) Math.pow(10, longitud) + numero;

        return numeroFinal;

    }

    public static void main(String[] args) {

        int numero = 23456, digito = 111;

        System.out.println(pegaPorDelante(numero, digito));

    }

}
