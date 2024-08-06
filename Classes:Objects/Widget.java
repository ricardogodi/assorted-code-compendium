/* Widget Class
 * Demo of static vs instance variables and methods
 * MCS 141
 * 11/13/18
 * */
 
public class Widget {
  private int id;
  private static int count = 0; // initialize static variables!
   
  public Widget() {
    count++;
    id = count;
  }
   
  // instance method
  public int getID() {
    return id;
  }
   
  // static method
  public static int getCount() {
    return count;
  }
  
  public void setCount(int count) {
    this.count = count;
  }
    
    
   
  public String toString() {
    return String.format("Widget number %d out of %d", id, count);
  }
   
  public int compareTo (Widget that) {
    /* First attempt (works!)
    if (this.id > that.id) {
      return 1;
    }
    else if (this.id < that.id) {
      return -1;
    }
    else {
      return 0;
    }
    */
    return this.id - that.id;
  }
   
   
}