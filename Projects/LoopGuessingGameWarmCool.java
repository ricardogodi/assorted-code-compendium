/* Ricardo Gonzalez 
 * Professor: Jonathan Sprague
 * MCS 141
 * Loop Guessing Game: My program generates a random number between 1 and 20, stores it
 * in a variable, and prompts the user to enter an integer between range. If it is not 
 * between that range, it will prompt again. If it is in the range but not the
 * right number it will promt again. Finally, if the guess is between the range 
 * and the right number, it tells the user how many tries it took him to guess it.
 * 10/9/18
 * */

import java.util.Scanner;
import java.util.Random;

public class LoopGuessingGameWarmCool {
  
  public static void main (String [] args) {
    
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    int guess;
    int randomNumber;
    
    randomNumber = generator.nextInt(20) + 1; 
    
    System.out.println(randomNumber);  
    
    int n = 0;
    int i = 0;
    
    int previousGuess = 0;
    
    do {
      System.out.println("Enter an integer between 1 and 20:");
      guess = scan.nextInt();
      
      while (guess < 1 || guess > 20) {
        System.out.println("Not in range! Enter an integer between 1 and 20:");
        guess = scan.nextInt();
        i++;
      }
      
      if (guess < randomNumber) {
        System.out.println("Too low!");
        
        if (previousGuess != 0) {
          
          if (guess > previousGuess) {
            System.out.println("Closer...");
          }
          if (guess < previousGuess) {
            System.out.println("Farther...");
          }
        }
      }
      
      if (guess > randomNumber) {
        System.out.println("Too High!");
        
        if (previousGuess != 0) {
          if (guess < previousGuess) {
            System.out.println("Closer...");
          } 
          if (guess > previousGuess) {
            System.out.println("Farther...");
          }
        }
      }
      
      previousGuess = guess;
      n++;
      
    } while (guess != randomNumber);
    System.out.printf("Congratulations! You got it! It took you %d attempt(s)!\n", n+i);
  }
}