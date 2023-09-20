public class SquareMeters extends Magnitude {
  private double width;
  private double height;

  public SquareMeters(MeasuringSystem system, String type, double width, double height) {
    super(width * height, "m2", system, type);
    this.width = width;
    this.height = height;
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
}
