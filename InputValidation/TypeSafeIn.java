/* Type-safe input
 * MCS 141
 * 10/4/18
 * */
 
import java.util.Scanner;
 
public class TypeSafeIn {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    int input;
     
    System.out.println("Please enter an integer:");
     
    while ( !scan.hasNextInt() ) { // while user does NOT give an int
      String garbage = scan.nextLine();
      System.out.println(garbage + " is not an integer.  Please enter an integer:");
    }
    // if we get here, we know there is an int to read
    input = scan.nextInt();
    // rest of application logic goes here
    System.out.println("Congratulations, " + input + " is an integer!");
  }
}