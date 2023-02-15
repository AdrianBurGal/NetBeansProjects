package bibliotecaFunciones;

public class PosicionDeDigito {

    public static void digitoN(int numero, int digitoN) {

        int digito, reverso = 0, posicion = 0;

        while (numero > 0) {
            digito = numero % 10;
            numero = numero / 10;
            reverso = (reverso * 10) + digito;
        }

        while (reverso > 0) {
            digito = reverso % 10;
            reverso = reverso / 10;
            posicion++;
            if (digito == digitoN) {
                System.out.println(posicion);
            }
        }
    }

    public static void main(String[] args) {

        int numero = 31133, digitoN = 3;

        digitoN(numero, digitoN);

    }
}
