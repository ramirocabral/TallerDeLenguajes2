package teoria.polimorfismo;

public class Percusion extends InstrumentoMusical{
    @Override
    public void tocar(String n) {
        System.out.println("teoria.polimorfismo.Percusion.tocar() " + n);
    }
}
