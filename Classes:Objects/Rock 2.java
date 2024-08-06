public class Rock extends Pet {
  public Rock() {
    super(); // call superclass constructor
  }
  
  public Rock(String name) {
    // this.name = name; // don't have access
    // setName( name ); // this works
    super( name );
  }
  
  //@Override // optional
 // public void speak() {
    //System.out.println();
  //}
  
  @Override
  public String toString() {
    return "Rock named " + getName();
  }
}