package Actividad_Resuelta_7_01;

class CuentaCorriente {

    String dni;
    String nombre;
    int saldo;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }

    public boolean sacarDinero(int cantidad) {

        boolean correcto = false;
        if (this.saldo >= cantidad) {
            this.saldo = this.saldo - cantidad;
            correcto = true;
        }
        return correcto;
    }

    public void ingresarDinero(int cantidad) {
        saldo = saldo + cantidad;
    }

    @Override
    public String toString() {
        return "dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo;
    }
}
