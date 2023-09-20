public class English extends MeasuringSystem {

  public English() {}

  public English(String mass, String length, String time) {
    super(mass, length, time);
  }

  @Override
  public Magnitude normalize(Magnitude m) {
    switch (m.getType()) {
      case "mass" -> {
        return normalizeMass(m);
      }
      case "length" -> {
        return normalizeLength(m);
      }
      default -> {
        return normalizeTime(m);
      }
    }
  }

  @Override
  public Magnitude normalizeMass(Magnitude m) {
    // return lbm
    Magnitude aux;
    if (m.getUnit().equals("oz")) {
      return (aux = new Magnitude(m.getValue() * 0.06250, "lbm", m.getSystem(), m.getType()));
    }
    return m;
  }

  @Override
  public Magnitude normalizeLength(Magnitude m) {
    // return meters
    Magnitude aux;
    switch (m.getUnit()) {
      case "in" -> {
        return (aux = new Magnitude(m.getValue() * 0.083, "ft", m.getSystem(), m.getType()));
      }
      case "yd" -> {
        return (aux = new Magnitude(m.getValue() * 3, "ft", m.getSystem(), m.getType()));
      }
      default -> {
        return m;
      }
    }
  }

  @Override
  public Magnitude normalizeTime(Magnitude m) {
    // return seconds
    Magnitude aux;
    switch (m.getUnit()) {
      case "hs" -> {
        return (aux = new Magnitude(m.getValue() * 3600, "s", m.getSystem(), m.getType()));
      }
      case "min" -> {
        return (aux = new Magnitude(m.getValue() * 60, "s", m.getSystem(), m.getType()));
      }
      default -> {
        return m;
      }
    }
  }

  @Override
  public Magnitude newMagnitude(double value, String unit, String type) {
    return new Magnitude(value, unit, this, type);
  }
}
