import java.util.Scanner;

/**Ricardo Gonzalez
  * MCS 141
  * Professor: Jonathan Sprague
  * 9/24/18
  * My program converts number of inches to miles,
  * yards, feet, and inches.
  * */

public class InchesToMilesYardsFeetInches {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter number of inches:");
    int inches = scan.nextInt();
    
   int feet = inches / 12;
   int yard = feet / 3;
   int mile = yard / 1760;
   
   int miles = yard / 1760;
   int yards = yard % 1760;
   
   System.out.println(yards);
   
    
    
  }
}
