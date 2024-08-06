import java.util.Scanner;

/* Input validation demo
 * Tests for correct data type
 * MCS 141
 * 9/25/18
 * */

public class ValidationDemo {
  
  public static void main( String [] args) {
    Scanner scan = new Scanner(System.in);
    int n = getInt(scan);
    System.out.println(n + " is an integer.");
  }
  
  public static int getInt(Scanner scan) {
    System.out.println("Enter an integer:");
    // base case
    if ( scan.hasNextInt() ) { // if an integer is ready to be read
      int result = scan.nextInt();
      return result;
    }
    else { // recursive call
      String garbage = scan.nextLine(); //clear bad data
      System.out.println( garbage + " is not an integer.");
      int result = getInt(scan);  //ask again  RECURSIVE CALL HERE
      return result;
    }
  }
}
    