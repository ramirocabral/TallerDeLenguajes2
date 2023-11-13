package ejPractica.ej3;

public class Orquesta {
    private Instrumento[] cuerdas;
    private Instrumento[] vientos;
    private Instrumento[] percusion;
    private Luthier luthier;

    // dudoso
    public Orquesta() {
        this.luthier = new Luthier();
        cuerdas = new Instrumento[2];
        vientos = new Instrumento[3];
        percusion = new Instrumento[2];
        for (int i = 0; i < cuerdas.length; i++) {
            cuerdas[i] = new Instrumento();
            luthier.afinar(cuerdas[i]);
        }
        for (int i = 0; i < vientos.length; i++) {
            cuerdas[i] = new Instrumento();
            luthier.afinar(cuerdas[i]);
        }
        for (int i = 0; i < percusion.length; i++) {
            cuerdas[i] = new Instrumento();
            luthier.afinar(cuerdas[i]);
        }
    }
}
