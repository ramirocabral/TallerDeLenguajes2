public class SpaceProbe<T extends Magnitude> {
  public SpaceProbe() {}

  public void printUnit(T m) {
    System.out.println(m.toString());
  }
}
