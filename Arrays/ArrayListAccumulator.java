import java.util.ArrayList;

/* ArrayListAccumulator Class
 * Class to compute the total and average of a list of numbers
 * Uses an ArrayList to track values entered
 * MCS 141
 * 11/7/17
 * */

public class ArrayListAccumulator {
  //instance variables
  private ArrayList<Integer> values;
  
  //default constructor
  public ArrayListAccumulator() {
    values = new ArrayList<Integer>();
  }
  
  //accessor methods
  public int getTotal() {
    int total = 0;
    for (Integer number : values) { // for every integer in values
      total += number;
    }
    return total;
  }
  
  public int getCount() {
    return values.size(); // number of used elements
  }
  
  public double getAverage() {
    return (double)getTotal()/getCount();
  }
  
  public void add(int toAdd) {
    values.add( toAdd );
  }
  
  public String listValues() {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < values.size(); i++) {
      output.append( values.get(i) );
      if (i < values.size() - 1) {
        output.append(", ");
      }
    }
    return output.toString();
  }
  
  public int getMax() {
    int max = values.get(0);
    for (int i = 0; i < values.size(); i++) {
      if (values.get(i) > max) {
        max = values.get(i);
      }
    }
    return max;
  }
  
  public int getMin() {
    int min = values.get(0);
    for (int i = 0; i < values.size(); i++) {
      if (values.get(i) < min) {
        min = values.get(i);
      }
    }
    return min;
  }
  
  @Override
  public String toString() {
    return "Accumulator:  Total = " + getTotal() + " Count = " + getCount();
  }
}