public class Club {
  
  private String name;
  private int count;
  
  public Club() { 
    count = 0;
    name = "New Club";
  }
  
  public Club(String name, int count) {
    this.name = name;
    this.count = count;
  }
  

  public String getName() {
    return name;
  }
  
  public int getCount() {
    return count;
  }
  
  public void setName(String name) {
   this.name = name; 
  }
  
  public void setCount(int count) {
   this.count = count; 
  }
  
   public String toString() {
    return String.format("The name of the club is: %s", name + " Number: " + count);
  }
  
}