public class Magnitude {
  private double value;
  private String unit;
  private MeasuringSystem system;
  private String type;

  public Magnitude(double value, String unit, MeasuringSystem system, String type) {
    this.value = value;
    this.unit = unit;
    this.system = system;
    this.type = type;
  }

  public Magnitude() {}

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public void setSystem(MeasuringSystem system) {
    this.system = system;
  }

  public MeasuringSystem getSystem() {
    return system;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return " " + value + unit + "\n";
  }

  public void setType(String type) {
    this.type = type;
  }
}
