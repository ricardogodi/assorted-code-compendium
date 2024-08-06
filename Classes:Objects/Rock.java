public class Rock extends Pet {
  public Rock() {
    super(); // call superclass constructor
  }
   
  public Rock(String name) {
    // this.name = name; // don't have access
    // setName( name ); // this works
    super( name );
  }
    
  public void hit() {
     System.out.println("Ouch!");
  }
  
  @Override // op ional
  public void speak() {
    System.out.println();
  }
   
  @Override
  public String toString() {
    return "Rock named " + getName();
  }
}