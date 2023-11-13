package teoria.polimorfismo;

public class CancionSimple {
    String[] notas = new String[5];

    public CancionSimple() {
        notas[0] = "do";
        notas[1] = "re";
        notas[2] = "mi";
        notas[3] = "fa";
        notas[4] = "sol";
    }

    public void sonar(InstrumentoMusical i){
        for (int j = 0; j < notas.length; j++) {
            i.tocar(notas[j]);
        }
    }

    public static void main (String[] args){
        CancionSimple c = new CancionSimple();
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = new Cuerdas();
        instrumentos[1] = new Saxo();
        instrumentos[2] = new Percusion();
        for (InstrumentoMusical inst : instrumentos) {
            c.sonar(inst);
        }
    }
}
