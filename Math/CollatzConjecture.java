import java.util.Scanner;

/**Ricardo Gonzalez
  * MCS 141
  * Professor: Jonathan Sprague
  * 9/24/18
  * My program implements the Collatz Conjecture
  * */

public class CollatzConjecture {
 
  public static int collatz(int n) {
    if (n == 1) {
      return 1;
    } else if (n % 2 == 0) {
      int halfn = n/2; 
      System.out.println(halfn);
      return collatz(halfn);    
    } else {
      int threeNplusOne = (n*3) + 1;
      System.out.println(threeNplusOne);
      return collatz(threeNplusOne);
    } 
  }
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int number = scan.nextInt();
    System.out.println(number);
    collatz(number);
  }
}