public class Dog extends Pet {
  public Dog() {
    super(); // call superclass constructor
  }
   
  public Dog(String name) {
    // this.name = name; // don't have access
    // setName( name ); // this works
    super( name );
  }
   
  @Override // optional
  public void speak() {
    System.out.println("Woof, woof!");
  }
   
  @Override
  public String toString() {
    return "Dog named " + getName();
  }
}