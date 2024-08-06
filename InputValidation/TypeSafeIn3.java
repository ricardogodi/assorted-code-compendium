/* Type-safe input
 * Uses a method to get type-safe input
 * Shows method of passing a Scanner
 * MCS 141
 * 10/4/18
 * */
 
import java.util.Scanner;
 
public class TypeSafeIn3{
  // getInt() method. prompt is the statement used to prompt the user
  public static int getInt(String prompt, Scanner scan) {
    int input;
    System.out.println(prompt);
    while ( !scan.hasNextInt() ) { // while user does NOT give an int
      String garbage = scan.nextLine();
      System.out.println(garbage + " is not an integer. " + prompt);
    }
    input = scan.nextInt();
    scan.nextLine(); // scanner bug
    return input;
  }
   
  // default getInt() method
  public static int getInt(Scanner scan) {
    int value = getInt("Please enter an integer:", scan); // calls getInt with a default prompt
    return value;
  }
   
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in); // set up one Scanner
    int a = getInt(scan);
    int b = getInt("Please enter a second integer:", scan);
    int c = getInt("Please enter a third integer:", scan);
    System.out.println("The sum is " + (a + b + c));
  }
}