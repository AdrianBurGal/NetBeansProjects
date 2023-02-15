package bibliotecaFunciones;

public class Digitos {

    public static int digitos(int numero) {

        int digito, contadorDigito = 1;

        while (numero >= 9) {
            
            digito = numero % 10;
            numero = numero / 10;
            contadorDigito++;
        }

        return contadorDigito;
    }

    public static void main(String[] args) {

        int numero = 0;

        System.out.println(digitos(numero));

    }
}
