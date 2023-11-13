package teoria.polimorfismo;

public class Saxo extends Vientos{
    private String tipo;

    public Saxo(String tipo) {
        this.tipo = tipo;
    }

    public Saxo() {
    }

    @Override
    public void tocar(String n) {
        System.out.println("teoria.polimorfismo.Saxo.tocar() " + n);
    }
}
