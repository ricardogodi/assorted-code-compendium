/* Accumulator Class
 * Class to compute the total and average of a list of numbers
 * MCS 141
 * 11/7/17
 * */
 
public class Accumulator {
  //instance variables
  private int total;
  private int count;
   
  //default constructor
  public Accumulator() {
    total = 0;
    count = 0;
  }
   
  //accessor methods
  public int getTotal() {
    return total;
  }
   
  public int getCount() {
    return count;
  }
   
  public double getAverage() {
    return (double)total/count;
  }
   
  public void add(int toAdd) {
    total += toAdd;
    count++;
  }
   
  @Override
  public String toString() {
    return "Accumulator:  Total = " + total + " Count = " + count;
  }
}