package ejPractica.ej3;

public class Instrumento {
    private TipoInstrumento tipo;
    private Afinacion afinacion;

    public Instrumento() {
    }
    public Instrumento(TipoInstrumento tipo) {
        this.tipo = tipo;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstrumento tipo) {
        this.tipo = tipo;
    }

    public Afinacion getAfinacion() {
        return afinacion;
    }

    public void setAfinacion(Afinacion afinacion) {
        this.afinacion = afinacion;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "tipo=" + tipo + ", afinacion=" + afinacion + '}';
    }
}
