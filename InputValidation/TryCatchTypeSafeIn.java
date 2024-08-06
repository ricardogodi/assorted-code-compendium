/* Try-Catch example with Scanner
 * (note this is probably better done as we handled
 * it earlier in the semester)
 * MCS 141
 * 4/26/18
 * */

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchTypeSafeIn {
  public static void main(String [] args) {
    
    Scanner scan = new Scanner(System.in);
    int input;
    
    while (true) {
      try {
        System.out.println("Please enter an integer:");
        input = scan.nextInt();
        break; // only reachable if line 20 executes w/o exception
      }
      catch (InputMismatchException ime) {
        System.out.println(scan.nextLine() + " wasn't an integer.");
      }
    } // end while
    
    System.out.println("Congratulations, you entered " + input);
  }
}
    