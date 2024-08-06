import java.util.Scanner;

/** Using two methods
  * */

public class Sword {

  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    printStick(n);
    printHead(n + 2);
    
  }
    public static void printStick(int n) {
    System.out.println();
    for (int i = 1; i <= n; i++) {
      printStars(n);
    } 
  }

  public static void printStars(int n) {
    for (int i = 1; i <= 2; i++ ) {
      System.out.print("*");
    } 
   System.out.println();
   
   
  }
    public static void printHead(int n) {
    for (int i = n; i >= 0; i--) {
      printStarshead(i);
    } 
  }

  public static void printStarshead(int n) {
    for (int i = 1; i <= n; i++ ) {
      System.out.print("*");
    } 
   System.out.println();
  }
}