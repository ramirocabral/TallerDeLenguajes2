public class International extends MeasuringSystem {

  public International() {
    super();
  }

  public International(String mass, String length, String time) {
    super(mass, length, time);
  }

  @Override
  public Magnitude normalize(Magnitude m) {
    Magnitude newMag = new Magnitude();
    switch (m.getType()) {
      case "mass" -> {
        newMag = this.normalizeMass(m);
      }
      case "length" -> {
        newMag = this.normalizeLength(m);
      }
      case "time" -> {
        newMag = this.normalizeTime(m);
      }
    }
    return newMag;
  }

  @Override
  public Magnitude normalizeMass(Magnitude m) {
    // return kilograms
    Magnitude aux;
    if (m.getUnit().equals("gr")) {
      return (aux = new Magnitude(m.getValue() / 1000, "kg", m.getSystem(), m.getType()));
    }
    return m;
  }

  @Override
  public Magnitude normalizeLength(Magnitude m) {
    // return meters
    Magnitude aux;
    switch (m.getUnit()) {
      case "cm" -> {
        return (aux = new Magnitude(m.getValue() / 100, "m", m.getSystem(), m.getType()));
      }
      case "km" -> {
        return (aux = new Magnitude(m.getValue() * 1000, "m", m.getSystem(), m.getType()));
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

  public Magnitude newMagnitude(double value, String unit, String type) {
    return new Magnitude(value, unit, this, type);
  }
}
