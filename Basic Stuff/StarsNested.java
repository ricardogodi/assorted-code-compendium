import java.util.Scanner;

/** Using Nested Loops
  * */

public class StarsNested {
  
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    
    //System.out.println("Enter a positive integer:");
    int n = 5;
    
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++ ) {
        System.out.print("*");
      } 
      System.out.println();
    }
  }
}

