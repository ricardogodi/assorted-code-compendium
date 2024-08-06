/* Class with static methods that use the Sprite class
 * MCS 141
 * 10/25/18
 * */

public class SpriteDemo {
  /* moveMore() method
   * Moves a Sprite n units in direction d
   * */
  public static void moveMore( Sprite s, int d, int n) {
    for (int i = 0; i < n; i++) {
      s.move(d);
    }
  }
  
  /* moveTo method that allows a final destination to be set
   * */
  public static void moveTo( Sprite s, int endX, int endY ) {
    int moveX = endX - s.getX();
    int moveY = endY - s.getY();
    if (moveX > 0) {
      moveMore( s, 6, moveX );
    }
    else {
      moveMore( s, 4, Math.abs(moveX));
    }
    if (moveY > 0) {
      moveMore( s, 8, moveY );
    }
    else {
      moveMore( s, 2, Math.abs(moveY));
    }
  }
  
  /* bringBack method returns an alive Sprite at the parameter's location */
  public static Sprite bringBack( Sprite s ) {
    int x = s.getX();
    int y = s.getY(); 
    Sprite aliveSprite = new Sprite( x, y, true, 50); // arbitrary health
    return aliveSprite;
  }
  
  // main for testing
  public static void main (String [] args) {
    Sprite first = new Sprite();
    System.out.println("first is: " + first);
    System.out.println("moveMore(first,7,6)");
    moveMore(first,7,6);
    System.out.println("first is: " + first);
    System.out.println("moveTo(first, 10, 12)");
    moveTo(first, 10, 12);
    System.out.println("first is: " + first);
    System.out.println("moveTo(first, 1000, -1000)");
    moveTo(first, 1000, -1000);
    System.out.println("first is: " + first);
    System.out.println("first.takeDamage(101)");
    first.takeDamage(101);
    System.out.println("first is: " + first);
    System.out.println("first = bringBack(first)");
    first = bringBack(first);
    System.out.println("first is: " + first);
  }
}