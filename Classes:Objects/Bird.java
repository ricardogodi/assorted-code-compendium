public class Bird extends Pet {
  public Bird() {
    super(); // call superclass constructor
  }
   
  public Bird(String name) {
   // this.name = name; // don't have access
    // setName( name ); // this works
   super( name );
  }
   
  public void fly() {
    System.out.println( getName() + " is flying!");
  }
   
  @Override // optional
  public void speak() {
    System.out.println("Tweet, tweet!");
  }
   
  @Override
  public String toString() {
    return "Bird named " + getName();
  }
}