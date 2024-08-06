public class PetClient {
  public static void main(String [] args) {
    Pet [] pets = new Pet[12];
     
    for (int i = 0; i < pets.length; i++) {
      switch( i%4 ) {
        case 0:
          pets[i] = new Bird();
          break;
        case 1:
          pets[i] = new Dog();
          break;
        case 2:
          pets[i] = new Rock();
          break;
        case 3:
          pets[i] = new SingingRock();
          break;
      }
    }
     
    for (int i = 0; i < pets.length; i++) {
      System.out.printf("Pet #%d is a %s and says: " , i+1 , pets[i].getClass() );
      pets[i].speak();
    }
  }
}