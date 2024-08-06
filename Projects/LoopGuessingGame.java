import java.util.Scanner;
import java.util.Random;

public class LoopGuessingGame {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    int r = 10;
      //generator.nextInt(20) + 1; 
    int g;     //Stands for 'guess'
    int n = 0; //counter
    int p = 0;   //Stands for 'previous guess'
    
    do {
      System.out.println("Enter an integer between 1 and 20");
      g = scan.nextInt();
      
      while (g < 1 || g > 20) {
        System.out.println("Not in range! Enter an integer between 1 and 20");
        g = scan.nextInt();
      }
      
      if (g < r) {
        System.out.println("Too low!");
        
        if (p!= 0) {
          if (Math.abs(r - g) > (Math.abs(r - p))) {
            System.out.println("Colder");
          } 
          if ((Math.abs(r - g) < Math.abs(r - p))) {
            System.out.println("Warmer");
          }
        }
      }
      
      if (g > r) {
        System.out.println("Too high!");
        
        if (p!= 0) {
          if (Math.abs(r - g) > (Math.abs(r - p))) {
            System.out.println("Colder");
          } 
          if ((Math.abs(r - g) < Math.abs(r - p))) {
            System.out.println("Warmer");
          } 
        }
      }
      
      p = g;
      n++;
    } while (g != r);
    System.out.printf("Congratulations! You got it! It took you %d attempt(s) to guess it !\n", n);
  }
}