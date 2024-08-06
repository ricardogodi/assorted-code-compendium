/* Abstract Class Demo
 * MCS 141
 * 11/29/18
 * */

public class Pet { // include abstract keyword
  private String name;

  
  public Pet() {
    name = "unknown";
  }
  
  public Pet(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
 // public abstract void speak(); // make speak an abstract method
  
  @Override
  public String toString() {
    return "Pet named " + name;
  }
}