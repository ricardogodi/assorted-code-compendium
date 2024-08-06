/*Basic guesing game
 * using selection only
 * MCS 141
 * date
 * */

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
  
  public static void main (String [] args) {
    //set up variables
    
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    int guess;
    int randomNumber;
    
    //generate random number
    randomNumber = generator.nextInt(20) + 1; //generate numbers from 1 to 20
    
    System.out.println(randomNumber); //testing   
    
    //get user input
    System.out.println("Enter a number from 1 to 20:");
    guess = scan.nextInt();
    
    if (guess == randomNumber) {
      System.out.println("Congratulations! You got it!");
    }
    else {
      int diff = Math.abs(guess - randomNumber);       //queremos valor absoluto!!!!
      System.out.printf("Sorry, you were off by %d.\n",diff);
    }
  }
}