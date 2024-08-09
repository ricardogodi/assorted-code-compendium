/* Ricardo Gonzalez
 * 12/01/18
 * Fraction Class
 * */

public class Fraction implements Comparable<Fraction> {
  private int num;
  private int denom;
  
  public Fraction() {
    this.num = 1; 
    this.denom = 1; 
  }
  
  public Fraction(int num) {
    this.num = num;
    this.denom = 1; 
  }
  
  public Fraction(int num, int denom) {
    this.setNum(num);
    this.setDenom(denom);
  }
  
  public int getNum() {
    return num; 
  }
  
  public int getDenom() {
    return denom; 
  }
  
  private void setNum(int num) {
    if (num == 0) {
      this.num = 0;   
      this.denom = 0;
    } else {
      this.num = num; 
    }
  }
  
  private void setDenom(int denom) {
    if (denom == 0) {
      this.denom = 1;
    } else {
      this.denom = denom;  
    }
  }
  

  public Fraction reduce() {
    int newNum = this.num;   
    int newDenom = this.denom;
    int smaller = Math.abs(newNum);
    
    if (this.num > this.denom) {
      smaller = Math.abs(newDenom);
    }
    
    
    for (int i = 1; i <= smaller; i++) {
      if (num % i == 0 && denom % i == 0) { //find GCF
        newNum = num/i;
        newDenom = denom/i;
      }
    }
    
    if (newNum < 0 && newDenom < 0) { //if both negative, fraction turns positive
      newNum = Math.abs(newNum); 
      newDenom = Math.abs(newDenom); 
    }
    
    Fraction temp = new Fraction(newNum, newDenom);
    return temp;
  }
  
  public Fraction multiply(Fraction that) {
    Fraction temp = new Fraction(this.getNum()*that.getNum(), 
                                 this.getDenom()*that.getDenom());
    return temp.reduce();
  }
  
  public Fraction divide(Fraction that) {
    Fraction temp = new Fraction(this.getNum()*that.getDenom(), 
                                 this.getDenom()*that.getNum());
    return temp.reduce();
  }
  
  
  public Fraction add(Fraction that) {
    int newNum1 = this.num;
    int newDenom1 = this.denom;
    int newNum2 = that.num;
    int newDenom2 = that.denom;
    
    int greaterDenom = Math.abs(newDenom1);
    int smallerDenom = Math.abs(newDenom2);
    int lcd = greaterDenom;
    
    if (Math.abs(newDenom1) < Math.abs(newDenom2)) {
      greaterDenom = Math.abs(newDenom2);
      smallerDenom =  Math.abs(newDenom1);
    }
    
    if (newDenom1 < 0) {
      newNum1 = (-1)*newNum1;
    }
    if (newDenom2 < 0) {
      newNum2 = (-1)*newNum2;
    }
    
    for(int i = 1; i <= greaterDenom; i++) { //find LCD
      int result = greaterDenom*i;
      if (result % smallerDenom == 0) {
        lcd = result;
        //System.out.println("LCD: " + lcd);
        break;
      }
    }
    
    newNum1 = (lcd/Math.abs(newDenom1))*newNum1;
    newNum2 = (lcd/Math.abs(newDenom2))*newNum2;
    
    int newNum = newNum1 + newNum2;
    int newDenom = lcd;
    Fraction temp = new Fraction(newNum, newDenom);
    return temp.reduce();
  }
  
  public Fraction subtract(Fraction that) {
    that.num = (-1)*that.num;
    Fraction temp = this.add(that);
    return temp.reduce();
  }
  
  public double valueOf() { 
    return (double) this.getNum() / this.getDenom();
  }
  

  public int compareTo(Fraction that) {
    double num1 = (double)this.num/this.denom;
    double num2 = (double)that.num/that.denom;
    
    if (num1 < num2) {
      return -1;
    } else if (num1 > num2) {
      return 1;
    } else {
      return 0;
    }
  }
  
  public boolean equals(Fraction that){ 
    double num1 = (double)this.num/this.denom;
    double num2 = (double)that.num/that.denom;
    return num1 == num2;
  }
  
  public String toString() {
    if (num > 0 && denom < 0) {
      return "" + (-1*num) + "/" + (-1*denom); 
    }
    if (num == 0) {
      return "" + 0;
    }
    if (denom == 1) {
      return "" + num;
    }
    return "" + num + "/" + denom; 
  }
}