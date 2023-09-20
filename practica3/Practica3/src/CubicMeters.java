public class CubicMeters extends Magnitude {
  private double width;
  private double height;
  private double length;

  public CubicMeters(
      MeasuringSystem system, String type, double width, double height, double length) {
    super((width * height * length), "m3", system, type);
    this.width = width;
    this.height = height;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }
}
