package bibliotecaFunciones;

public class Voltea {

public static int voltea(int num) {
        
    int resto, numrev = 0;
        num = num*10 +1;
        while (num > 0) {
            resto = num % 10;
            numrev = numrev * 10 + resto;
            num /= 10;
        }

        return numrev;
    }

    public static void main(String[] args) {

        int numero = 100;

        System.out.println(voltea(numero));

    }
}