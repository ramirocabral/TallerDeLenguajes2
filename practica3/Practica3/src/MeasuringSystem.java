public abstract class MeasuringSystem {
  private String mass;
  private String length;
  private String time;

  public MeasuringSystem(String mass, String length, String time) {
    this.mass = mass;
    this.length = length;
    this.time = time;
  }

  public MeasuringSystem(){}

  public String getMass() {
    return mass;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public void setMass(String mass) {
    this.mass = mass;
  }

  @Override
  public String toString() {
    return "MeasuringSystem{" +
            "mass='" + mass + '\'' +
            ", length='" + length + '\'' +
            ", time='" + time + '\'' +
            '}';
  }


  public boolean equals(MeasuringSystem other) {
      return this.mass.equals(other.getMass())
          && this.length.equals(other.getLength())
          && this.time.equals(other.getTime());
  }

  public abstract Magnitude newMagnitude(double value, String unit, String type);

  public abstract Magnitude normalize(Magnitude m);

  public abstract Magnitude normalizeMass(Magnitude m);

  public abstract Magnitude normalizeLength(Magnitude m);

  public abstract Magnitude normalizeTime(Magnitude m);
}
