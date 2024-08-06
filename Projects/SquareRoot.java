/* SquareRoot Class
 * MCS 141
 * 
 * */

public class SquareRoot implements Comparable<SquareRoot> {
  //instance variables
  private int coef;
  private int rad;
  
 
  //overloaded constructor to set radicand
  public SquareRoot(int rad) {
    this( 1, rad); // calls the 2-parameter constructor
  }
  
  //overloaded constructor to set radicand and coefficient
  public SquareRoot(int coef, int rad) {
    setRad(rad);
    this.coef = coef;
  }
  
  private void setRad(int rad) {
    if (rad < 0 ) {
      System.err.println(rad + " passed for radicand. Used " + (-rad) + " instead.");
    }
    this.rad = Math.abs(rad);
  }
   
  public SquareRoot simplify() {
    // make copies so we don't change the original data
    int newCoef = this.coef;
    int newRad = this.rad;
    // find largest perfect square that divides evently into rad
    int largest = 1; // assume 1
    for (int i = 1; i*i <= newRad; i++) {
      if (newRad % (i*i) == 0 ) { // found a perfect square
        largest = i; // note... largest = i, not i*i
      }
    }
    newCoef = newCoef*largest;
    newRad = newRad / (largest*largest);
    SquareRoot temp = new SquareRoot(newCoef, newRad);
    return temp;
  }
  
  public SquareRoot add(SquareRoot that) {
    // make simplified copies
    SquareRoot temp1 = this.simplify();
    SquareRoot temp2 = that.simplify();
    if (temp1.rad == temp2.rad) { // same radicand
      int newCoef = temp1.coef + temp2.coef;
      return new SquareRoot( newCoef, temp1.rad);
    }
    return null; // if data is not compatible.  Later we will learn to throw exceptions.
  }
  
  public SquareRoot subtract(SquareRoot that) {
    // make use of add
    SquareRoot temp = new SquareRoot(-1*that.coef, that.rad);
    return this.add(temp);
  }
  
  public SquareRoot multiply(SquareRoot that) {
    int newCoef = this.coef*that.coef;
    int newRad = this.rad*that.rad;
    SquareRoot temp = new SquareRoot(newCoef, newRad);
    return temp.simplify();
  }
  
  public double getValue() {
    return coef*Math.sqrt(rad);
  }
  
  public boolean equals(SquareRoot that) {
    SquareRoot temp1 = this.simplify();
    SquareRoot temp2 = that.simplify();
    if ( temp1.coef == temp2.coef
          && temp1.rad == temp2.rad) {
      return true;
    }
    return false;
  }
  
  public int compareTo(SquareRoot that) {
    int num1 = Math.abs(this.coef)*this.coef*this.rad;
    int num2 = Math.abs(that.coef)*that.coef*that.rad;
    return num1 - num2;
  }
  
  
  @Override
  public String toString() {
    if (rad == 0 || coef == 0)
      return "0";
    if (rad == 1)
      return "" + coef;
    if (coef == 1)
      return "\u221A" + rad;
    return coef + "\u221A" + rad;
  }
}