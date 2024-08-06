public class Rectangle {
  
  private double length;
  private double width;
  
  public Rectangle() {
    this.length = 1.0;
    this.width = 1.0;
  }
  
  public Rectangle(double length, double width) {
    this.length = Math.abs(length);
    this.width = Math.abs(width);
  }
  
  public double getLength() {
    return this.length; 
  }
  
  public double getWidth() {
    return this.width; 
  }
  
  public void setLength(double length) {
    if (length < 0) {
      System.err.println("Negative value passed for width.  Absolute value used.");
    }
    this.length = Math.abs(length); 
  }
  
  public void setWidth(double width) {
    if (width < 0) {
      System.err.println("Negative value passed for width.  Absolute value used.");
    }
    this.width = Math.abs(width); 
  }
  
  public double getArea() {
    return this.width*this.length; 
  }
  
  public double getPerimeter() {
    return this.width*2 + this.length*2; 
  }
  
  public String toString() {
    return String.format("Rectangle: Length = %.1f, Width = %.1f", length, width);
  }
  
  public boolean equals(Rectangle that) {
    return this.length == that.length && this.width == that.width; 
  }
}