/* Basic guessing game
 * (using selection only)
 * MCS 141
 * 9/18/18
 * */
import java.util.Scanner;
import java.util.Random;

public class GuessingGame2 {
  public static void main (String [] args) {
    // set up variables
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    int guess;
    int randomNumber;
    
    // generate random number
    randomNumber = generator.nextInt(20) + 1; // generates numbers from 1 to 20
    //System.out.println(randomNumber); // testing
    
    // get user input
    System.out.println("Enter a number from 1 to 20:");
    guess = scan.nextInt();
    
    
     while (n < 1 || n > 20) {
      System.out.printf("Enter an integer between %d and %d\n", 1, 20);
      n = input.nextInt();
     }
    while
    if (guess == randomNumber) {
      System.out.println("Congratulations!  You got it!");
    }
    else {
      int diff = Math.abs(guess - randomNumber);
      System.out.printf("Sorry, you were off by %d.%n", diff);
    }
    
  }
}