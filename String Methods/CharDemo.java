/* Char demo
 * MCS 141
 * 10/16/18
 * */
 
import java.util.Scanner;
 
public class CharDemo {
  public static void main(String [] args) {
    System.out.println("Print out ASCII table:");
    for (int i = 0; i < 256; i++) {
      if (i % 16 == 0) {
        System.out.println();
      }
      System.out.print( (char)i + " " );
    }
    System.out.println("\n");
     
    // Add an application to determine if a character is a letter
    Scanner scan = new Scanner(System.in);
    char choice; // to hold "do again?" choice
    do { // application loop
      System.out.println("Enter a character:");
      String input = scan.nextLine();  // read input as String
      char first = input.charAt(0); // extract first character
      if ( first >= 'A' && first <= 'Z') { // could use 65 and 90
        System.out.println("Upper case letter");
      }
      else if ( first >= 'a' && first <= 'z') {
        System.out.println("Lower case letter");
      }
      else {
        System.out.println("Not a letter");
      }
      System.out.println("Again? <y/n>");
      /* read String, convert to lowercase, extract first character
       * and store (method chaining).
       * Could have been done using multiple steps. */
      choice = scan.nextLine().toLowerCase().charAt(0);
    } while( choice == 'y' ); // end do-while
    System.out.println("Goodbye!");
     
  }
}