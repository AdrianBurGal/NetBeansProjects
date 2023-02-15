
package Actividad_Aplicacion_7_16;

public class Main {

    public static void main(String[] args) {

        double distancia;
        Punto p1 = new Punto(1.0, 2.5);

        p1.muestra();

        p1.desplazaX(1.0);
        p1.desplazaY(-2.0);
        p1.muestra();

        Punto p2 = new Punto(5.0, 1.0);

        distancia = p1.distanciaEuclidea(p2);

        System.out.println("La distancia entre p1 y p2 es: " + distancia);

    }
}
