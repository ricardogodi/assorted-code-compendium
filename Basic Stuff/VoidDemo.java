/*Void Method Demo
 * Distance Formula
 * MCS 141
 * 9/6/18
 */

import java.util.Scanner;

public class VoidDemo {
  
  /* Distance Formula Method
   * Prints the distance from (x1, y1) to (x2,y2)
   */
  
  public static void distance(double x1, double y1, double x2, double y2)  { //here the user is gonna provide
    //in method body, we can assume all parameteres are initialized with values
    double deltaX = x2 - x1;
    double deltaY = y2 - y1;
    double sumSquares = deltaX * deltaX + deltaY * deltaY;
    double dist = Math.sqrt(sumSquares);
    System.out.printf("The distance from (%.2f, %.2f) to (%.2f, %.2f) is %.2f.",
                      x1, y1, x2, y2, dist); 
  }
}
