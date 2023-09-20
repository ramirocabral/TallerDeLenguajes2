import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @org.junit.jupiter.api.Test
  void englishToInternational() {
    MeasuringSystem international = new International("kg", "m", "s");
    MeasuringSystem english = new English("lbm", "ft", "s");
    SpaceProbe<International> space = new SpaceProbe<>(international);
    Magnitude m1 = new Magnitude(2, "ft", english, "length");
    Magnitude m2 = new Magnitude(6, "lbm", english, "mass");
    Magnitude m3 = new Magnitude(8, "m", international, "length");
    Magnitude m4 = new Magnitude(8, "hs", international, "time");
    List<Magnitude> magnitudes = List.of(m1, m2, m3, m4);
    Calculator calc = new Calculator(List.of(international, english));
    for (Magnitude m : magnitudes) {
      Magnitude m5 = calc.englishToInternational(m);
      Magnitude m6 = m5.getSystem().normalize(m5);
      space.printUnit(m6);
      assertEquals(m5.getSystem().getClass(), International.class);
    }
  }
  @org.junit.jupiter.api.Test
  void internationalToEnglish() {}

  @org.junit.jupiter.api.Test
  void add() {}
}