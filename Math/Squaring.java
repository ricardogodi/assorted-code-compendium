/* Ricardo Gonzalez
 * Professor: Jonathan Sprague
 * Squaring Project
 * MCS 141
 * 10/14/18
 * */

import java.util.Scanner;

public class Squaring {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    long firstInput;
    long squared;
    long number;
    int i;
    
    do {
      System.out.println("Enter an integer greater than 1:");
      number = getSafeType(scan);
      firstInput = number;
      if (number <= 1) {
        System.out.println(number + " is not greater than 1.");
      }
      scan.nextLine();
    } while (number <= 1); 
    
    for (i = 0; number < 1000000; i++) {
      squared = number*number;
      System.out.println(squared);
      number = squared;
    }
    System.out.println(firstInput + " exceeded 1,000,000 after " + i + " squarings.");
  }
  
  public static int getSafeType(Scanner scan) {
    
    int input;
    while ( !scan.hasNextInt() ) {
      String invalid = scan.nextLine();
      System.out.println(invalid + " is not valid input.");
      System.out.println("Enter an integer greater than 1:");
    }
    input = scan.nextInt();
    return input;
  }
}