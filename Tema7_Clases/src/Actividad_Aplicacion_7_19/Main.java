package Actividad_Aplicacion_7_19;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(2);
        pila.push(0);
        pila.push(5);
        pila.push(8);

        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }

}
