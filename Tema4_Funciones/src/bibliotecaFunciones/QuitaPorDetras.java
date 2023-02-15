package bibliotecaFunciones;

public class QuitaPorDetras {

    public static int quitaPorDetras(int numero, int longitud) {

        int numeroFinal = 0, reverso = 0, digito, longitudNum = 0;

        while (numero > 0) {
            digito = numero % 10;
            numero = numero / 10;
            reverso = reverso * 10 + digito;
            longitudNum++;
        }

        for (int contador = longitudNum - longitud; contador > 0; contador--) {
            digito = reverso % 10;
            reverso = reverso / 10;
            numeroFinal = (numeroFinal * 10) + digito;
        }

        return numeroFinal;
    }

    public static void main(String[] args) {

        int numero = 12345, longitud = 2;

        System.out.println(quitaPorDetras(numero, longitud));

    }

}
