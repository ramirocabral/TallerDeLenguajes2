public class SpaceProbe<T extends MeasuringSystem>{
  private MeasuringSystem system;
  public SpaceProbe(MeasuringSystem system) {
    this.system = system;
  }

  public void printUnit(Magnitude m) {
      System.out.println(m.toString());

  }
}