package bibliotecaFunciones;

public class QuitaPorDelante {

    public static int quitaPorDelante(int numero, int longitud) {

        int numeroFinal = 0, reverso = 0, digito;

        while (numero > 0) {
            digito = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + digito;
        }

        for (int contador = 0; contador < longitud; contador++) {
            reverso = reverso / 10;
        }

        while (reverso > 0) {
            digito = reverso % 10;
            reverso = reverso / 10;
            numeroFinal = (numeroFinal * 10) + digito;
        }

        return numeroFinal;
    }

    public static void main(String[] args) {

        int numero = 12345, longitud = 1;

        System.out.println(quitaPorDelante(numero, longitud));

    }

}
