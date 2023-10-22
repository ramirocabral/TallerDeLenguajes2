package teoria.polimorfismo;

public class Cuerdas extends InstrumentoMusical{
    private int numeroCuerdas;

    public Cuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public Cuerdas(){
    }

    @Override
    public void tocar(String n) {
        System.out.println("teoria.polimorfismo.Cuerdas.tocar() " + n);
    }
}
