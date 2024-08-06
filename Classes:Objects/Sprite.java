/** Sprite class<br>
  * Used to demonstrate simple class structure
  * and using objects.<br>
  * MCS 141
  * @author Sprague, Jon
  * @version Fall 2017
  * */
 
public class Sprite {                  //sprites, moving things in 2D. Candys in candy crush
  // instance variables                //IN THE CLASS
  private int x; // x location         // HIDDEN INFORMATION
  private int y; // y location
  private boolean alive;
  private int health;
   
  /**
   * Default constructor.  Sets location to (0,0), health to 100, and status to "alive".
   * */
  public Sprite() {
    x = 0;
    y = 0;
    alive = true;
    health = 100;
  }
   
  /**
   * Overloaded constructor.
   * @param x the initial x-coordinate
   * @param y the initial y-coordinate
   * @param alive a boolean representing whether the Sprite is initially alive
   * @param health the initial health
   * */
  public Sprite(int x, int y, boolean alive, int health) {                 //OBJECT
    this.x = x;
    this.y = y;
    this.alive = alive;
    this.health = health;
  }
   
  /**
   * Accessor method.
   * @return the current x-coordinate of the Sprite.
   * */
  public int getX() {             //INSTANCE METHOD. NOT STATIC.
    return x;                     //
  }
   
  /**
   * Accessor method.
   * @return the current y-coordinate of the Sprite.
   * */
  public int getY() {
    return y;
  }
   
  /**
   * Accessor method.
   * @return the current status of the Sprite (true = alive, false = dead).
   * */
  public boolean isAlive() {
    return alive;
  }
   
  /**
   * Accessor method.
   * @return the current health of the Sprite.
   * */
  public int getHealth() {
    return health;
  }
   
  /**
   * Mutator method to allow the Sprite to be moved.  This method takes an argument
   * that corresponds to a number on the numeric keypad.  For example, move(8) would move
   * the Sprite up one unit, while move(1) would move the Sprite down one unit and one unit
   * to the left.  A "dead" Sprite will not move.
   * @param direction an integer corresponding to a value on the numeric keypad.
   * */
  public void move(int direction) {
    if (alive) {
      if ( direction >= 1 && direction <= 3)
        y--;
      if ( direction >= 7 && direction <= 9)
        y++;
      if ( direction == 1 || direction == 4 || direction == 7 )
        x--;
      if ( direction == 3 || direction == 6 || direction == 9 )
        x++;
    }
  }
   
  /**
   * Mutator method to reduce the Sprite's health.  The amount of damage is
   * subtracted from the health (provided that a positive amount is given).
   * If health drops to zero or below, the Sprite's status is set to "dead".
   * @param amount the amount of damage taken
   * */
  public void takeDamage(int amount) {
    if (amount > 0) {
      health -= amount;
    }
    if (health <= 0) {
      alive = false;
    }
  }
   
  /**
   * Mutator method to increase the Sprite's health.  The amount of healing is
   * added to the health (provided that a positive amount is given).
   * A "dead" Sprite cannot be healed.
   * @param amount the amount of healing
   * */
  public void heal(int amount) {
    if (alive && amount > 0) {
      health += amount;
    }
  }
   
  @Override
  public String toString() {
    String state;
    if (alive) {
      state = "alive";
    }
    else {
      state = "dead";
    }
    return String.format("Sprite is %s at (%d,%d) with %d health.", state, x, y, health);
  }
}