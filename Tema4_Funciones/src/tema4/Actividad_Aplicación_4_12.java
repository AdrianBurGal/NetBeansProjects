package tema4;

public class Actividad_Aplicación_4_12 {

    public static double distancia(double x1, double y1, double x2, double y2) {

        double distancia;

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distancia;
    }

    public static void main(String[] args) {

        double x1 = 1, x2 = 2, y1 = 3, y2 = 4;

        System.out.println("La distancia es: " + distancia(x1, y1, x2, y2));

    }

}
