package practica6.ej4;

public class Fecha implements Comparable<Fecha>{
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio() {
        return this.anio;
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }

    @Override
    public int compareTo(Fecha otra) {
        if (this.anio < otra.anio) {
            return -1;
        } else if (this.anio > otra.anio) {
            return 1;
        } else {
            if (this.mes < otra.mes) {
                return -1;
            } else if (this.mes > otra.mes) {
                return 1;
            } else {
                if (this.dia < otra.dia) {
                    return -1;
                } else if (this.dia > otra.dia) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
