package bibliotecaFunciones;

public class TrozoDeNumero {

    public static int trozoDeNumero(int numero, int inicio, int fin) {

        int digito, reverso = 0, longitudNum = 0, aux = numero, numeroFinal = 0;

        while (numero > 0) {
            digito = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + digito;
            longitudNum++;
        }

        for (int contador = 1; contador < inicio; contador++) {
            reverso = reverso / 10;
        }

        while (reverso > 0) {
            digito = reverso % 10;
            reverso = reverso / 10;
            numeroFinal = (numeroFinal * 10) + digito;
        }

        for (int contador = 0; contador < longitudNum - fin; contador++) {
            numeroFinal = numeroFinal / 10;
        }

        return numeroFinal;
    }

    public static void main(String[] args) {

        int numero = 123456, inicio = 3, fin = 5;

        System.out.println(trozoDeNumero(numero, inicio, fin));

    }

}
