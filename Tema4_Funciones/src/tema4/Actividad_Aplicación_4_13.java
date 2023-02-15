package tema4;

public class Actividad_Aplicación_4_13 {

    public static void muestraPares(int n) {

        int pares = 0;

        for (int contador = 1; contador <= n; contador++) {
            pares = pares + 2;
            System.out.print(pares + " ");
        }
    }

    public static void main(String[] args) {

        int n = 9;

        muestraPares(n);
    }
}
