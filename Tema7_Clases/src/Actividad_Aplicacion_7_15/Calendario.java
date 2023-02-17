package Actividad_Aplicacion_7_15;

public class Calendario {

    private int dia;
    private int mes;
    private int año;

    public Calendario(int dia, int mes, int año) {

        if (dia < 1 || dia > 31) {
            this.dia = 1;
        } else {
            this.dia = dia;
        }

        if (mes < 1 || mes > 12) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }

        if (año == 0) {
            this.año = 1;
        } else {
            this.año = año;
        }

    }

    public void incrementarDia() {

        setDia(getDia() + 1);
        switch (getMes()) {

            case 1,3,5,7,8,10,12 -> {
                if (getDia() == 32) {
                    setDia(1);
                    incrementarMes();
                }
            }
            case 4,6,9,11 -> {
                if (getDia() == 31) {
                    setDia(1);
                    incrementarMes();
                }
            }
            case 2 -> {
                if (getDia() == 29) {
                    setDia(1);
                    incrementarMes();
                }
            }

        }

    }

    public void incrementarMes() {

        setMes(getMes() + 1);

        if (getMes() > 12) {
            setMes(1);
        }

    }

    public void incrementarAño(int cantidad) {

        setAño(getAño() + cantidad);

    }

    public void mostrar() {

        System.out.printf("La fecha actual es: %d/%d/%d \n", getDia(), getMes(), getAño());

    }

    public boolean iguales(Calendario otraFecha) {

        boolean res = false;

        if (this.getDia() == otraFecha.getDia() && this.getMes() == otraFecha.getMes() && this.getAño() == otraFecha.getAño()) {

            res = true;
        }

        return res;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
