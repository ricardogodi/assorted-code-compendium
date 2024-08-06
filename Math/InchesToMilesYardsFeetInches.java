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
    
    
    final int inchesPerFeet = 12;
    final int feetPerYard = 3;
    final int yardsPerMile = 1760;
    
    int miles = inches/inchesPerFeet/feetPerYard/yardsPerMile;
    int yards = (inches/inchesPerFeet/feetPerYard) % yardsPerMile;
    int feet = (inches/inchesPerFeet) % feetPerYard;
    int inchesremainder = (inches) % inchesPerFeet;
    
    System.out.println(inches + " inches is equivalent to:"); 
    System.out.println("Miles: " + miles + "\nYards: " + yards 
                  + "\nFeet: " + feet + "\nInches: " + inchesremainder);
  }
}
