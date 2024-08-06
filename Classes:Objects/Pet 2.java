/* Inheritance Demo
 * MCS 141
 * 11/27/18
 * */
 
public class Pet {
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
   
  public void speak() {
    System.out.println("default sound");
  }

   
  @Override
  public String toString() {
    return "Pet named " + name;
  }
}