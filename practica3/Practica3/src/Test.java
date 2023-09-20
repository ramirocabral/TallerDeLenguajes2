import java.util.List;

public class Test {
  public static void main(String[] args) {
    MeasuringSystem inter = new International("kg", "m", "s");
    Magnitude m = inter.newMagnitude(1, "gr", "mass");
    System.out.println(m.getValue() + " " + m.getUnit());
    m = inter.normalize(m);
    System.out.println(m.getValue() + " " + m.getUnit());
    MeasuringSystem eng = new English("lbm", "ft", "s");
    Magnitude m2 = eng.newMagnitude(2, "oz", "mass");
    List<MeasuringSystem> systems = List.of(inter, eng);
    Calculator calc = new Calculator(systems);
    Magnitude nashe = Calculator.add(m, m2);
    System.out.println(nashe.getValue() + " " + nashe.getUnit());
  }
}
