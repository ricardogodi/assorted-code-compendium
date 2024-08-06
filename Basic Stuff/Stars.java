import java.util.Scanner;

/** Using two methods
  * */

public class Stars {

  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    printRow(n);
    
  }
    public static void printRow(int n) {
    System.out.println();
    for (int i = 1; i <= n; i++) {
      printStars(i);
    } 
  }

  public static void printStars(int n) {
    for (int i = 1; i <= n; i++ ) {
      System.out.print("*");
    } 
   System.out.println();
  }
}