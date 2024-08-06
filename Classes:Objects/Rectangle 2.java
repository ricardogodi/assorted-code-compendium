public class Rectangle implements ShapeInterface {
  double height;
  double base;
  
  public Rectangle() {
    base = 1;
    height = 1;
  }
  
  public Rectangle(double height, double base) {
    this.base = base;
    this.height = height;
  }
  
  public double getPerimeter() {
    return 2*base + 2*height;
  }
  
  public double getArea() {
    return base*height;
  }
  
}