package tema4;

public class Actividad_Aplicación_4_16 {
    
    public static boolean esPrimo(int parametro) {

        boolean primo = true;

        for (int contador = 2; contador < parametro && primo; contador++) {
            if (parametro % contador == 0) {
                primo = false;
            }
        }
        return primo;
    }
    
    public static void divisoresPrimos(int parametro) {
        
        for (int divisor = 1; divisor <= parametro; divisor++){

            if ((parametro % divisor == 0) && (esPrimo(divisor))) {
                System.out.println(divisor);
            }
        }
    }

    public static void main(String[] args) {

        int parametro = 29;

        divisoresPrimos(parametro);
        
    }
}
