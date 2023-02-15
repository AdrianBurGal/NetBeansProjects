package bibliotecaFunciones;

public class Capicua {

    public static boolean esCapicua(int numero) {

        int reverso = 0, digito, auxiliar;
        boolean capicua = false;

        auxiliar = numero;
        while (auxiliar > 0) {
            digito = auxiliar % 10;
            auxiliar = auxiliar / 10;
            reverso = (reverso * 10) + digito;
        }

        if (numero == reverso) {
            capicua = true;
        }
        return capicua;
    }

    public static void main(String[] args) {

        int numero = 1221;

        System.out.println(esCapicua(numero));

    }
}
