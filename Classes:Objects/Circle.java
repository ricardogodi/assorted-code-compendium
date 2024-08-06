/* Circle class
 * Demonstration of basic class writing
 * and data validation using setter methods
 * MCS 141
 * 11/8/18
 * */
 
public class Circle {
  // instance variable
  private double radius;
   
  // constructor
  public Circle(double radius) {
    //this.radius = radius;  // potentially problematic... will fix later
    setRadius(radius); // use set method to validate data
  }
   
  // getters
  public double getRadius() {
    return radius;
  }
   
  public double getDiameter() {
    return 2*radius;
  }
   
  public double getCircumference() {
    return 2*Math.PI*radius;
  }
   
  public double getArea() {
    return Math.PI*radius*radius;
  }
   
  // set method (used to validate input)
  public void setRadius(double radius) {
    if (radius < 0) {
      System.err.println("Negative value passed for radius.  Absolute value used.");
    }
    this.radius = Math.abs(radius);
  }
   
  public boolean equals(Circle that) {
    if (this.radius == that.radius) {
      return true;
    }
    else {
      return false;
    }
    // or return this.radius == that.radius;
  }
     
   
  public String toString() {
    return "Circle with radius = " + radius;
  }
}