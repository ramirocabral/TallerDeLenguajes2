import java.util.List;

public class Calculator {

  private static List<MeasuringSystem> systems;

  // 0 : international
  // 1 : english

  public Calculator(List<MeasuringSystem> systems) {
    Calculator.systems = systems;
  }

  public static Magnitude englishToInternational(Magnitude m) {
    switch (m.getUnit()) {
      case "ft" -> {
        return (new Magnitude(m.getValue() * 0.3048, "m", systems.get(0), "length"));
      }
      case "lbm" -> {
        return (new Magnitude(m.getValue() * 0.45376, "kg", systems.get(0), "mass"));
      }
      default -> {}
    }
    return m;
  }

  public static Magnitude internationalToEnglish(Magnitude m) {
    switch (m.getUnit()) {
      case "m" -> {
        return (new Magnitude(m.getValue() * 3.280839895, "ft", systems.get(1), "length"));
      }
      case "kg" -> {
        return (new Magnitude(m.getValue() * 2.2046226218, "lbm", systems.get(1), "mass"));
      }
      default -> {}
    }
    return m;
  }

  public static Magnitude add(Magnitude m, Magnitude n) {
    m = m.getSystem().normalize(m);
    n = n.getSystem().normalize(n);
    if (m.getSystem().equals(n.getSystem())) {
      return (new Magnitude(m.getValue() + n.getValue(), m.getUnit(), m.getSystem(), m.getType()));
    } else {
      if (m.getSystem().equals(systems.get(0))) { // si es international
        return new Magnitude(
            m.getValue() + englishToInternational(n).getValue(),
            m.getUnit(),
            m.getSystem(),
            m.getType());
      } else {
        return new Magnitude(
            m.getValue() + internationalToEnglish(n).getValue(),
            m.getUnit(),
            m.getSystem(),
            m.getType());
      }
    }
  }
}
