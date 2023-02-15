package bibliotecaFunciones;

public class DigitoN {

    public static int posicionDeDigito(int numero, int nDigito) {

        int digito = 0, contador = 0, reverso = 0;

        while (numero > 0) {
            digito = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + digito;
        }

        do {
            digito = reverso % 10;
            reverso = reverso / 10;
            contador++;
        } while (digito != nDigito);

        return contador;
    }

    public static void main(String[] args) {

        int numero = 1234, nDigito = 8;

        System.out.println(posicionDeDigito(numero, nDigito));

    }
}
