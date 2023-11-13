package ejPractica.ej1;

public enum TipoPlaneta {
    ROCOSO, GASEOSO;

    public String toString() {
        if (this == ROCOSO) return "Rocoso";
        return "Gaseoso";
    }
}
