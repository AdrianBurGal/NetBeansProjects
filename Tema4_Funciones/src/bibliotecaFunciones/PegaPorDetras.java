package bibliotecaFunciones;

public class PegaPorDetras {

    public static int pegaPorDetras(int numero, int digito) {

        int aux = numero, longitud = 0, numeroFinal;

        numeroFinal = numero * 10 + digito;

        return numeroFinal;

    }

    public static void main(String[] args) {

        int numero = 12345, digito = 6;

        System.out.println(pegaPorDetras(numero, digito));

    }

}
