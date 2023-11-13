package teoria.polimorfismo;

public class Vientos extends InstrumentoMusical{
    @Override
    public void tocar(String n) {
System.out.println("teoria.polimorfismo.Vientos.tocar() " + n);
    }
}
