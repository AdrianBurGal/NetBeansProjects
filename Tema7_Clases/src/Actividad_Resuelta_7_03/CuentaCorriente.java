package Actividad_Resuelta_7_03;

class CuentaCorriente {

    private String dni;
    private String nombre;
    private int saldo;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }

    public boolean sacarDinero(int cantidad) {

        boolean correcto = false;
        if (this.getSaldo() >= cantidad) {
            this.setSaldo(this.getSaldo() - cantidad);
            correcto = true;
        }
        return correcto;
    }

    public void ingresarDinero(int cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    @Override
    public String toString() {
        return "dni=" + getDni() + ", nombre=" + getNombre() + ", saldo=" + getSaldo();
    }
}
