/* Type-safe input
 * Uses a method to get type-safe input
 * MCS 141
 * 10/4/18
 * */
 
import java.util.Scanner;
 
public class TypeSafeIn2 {
  // getInt() method. prompt is the statement used to prompt the user
  public static int getInt(String prompt) {
    Scanner scan = new Scanner(System.in);
    int input;
    System.out.println(prompt);
    while ( !scan.hasNextInt() ) { // while user does NOT give an int
      String garbage = scan.nextLine();
      System.out.println(garbage + " is not an integer. " + prompt);
    }
    input = scan.nextInt();
    return input;
  }
   
  // default getInt() method
  public static int getInt() {
    int value = getInt("Please enter an integer:"); // calls getInt with a default prompt
    return value;
  }
   
  public static void main(String args[]) {
    int a = getInt();
    int b = getInt("Please enter a second integer:");
    int c = getInt("Please enter a third integer:");
    System.out.println("The sum is " + (a + b + c));
  }
}