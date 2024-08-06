import java.util.Scanner;

/**Ricardo Gonzalez
  * MCS 141
  * Professor: Jonathan Sprague
  * 9/24/18
  * My program converts number of inches to miles,
  * yards, feet, and inches.
  * */

public class InchesToMilesYardsFeetInches2 {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter number of inches:");
    int inches = scan.nextInt();
    
    final int inchesPerFeet = 12;
    final int feetPerYard = 3;
    final int yardsPerMile = 1760;
      
    int feet = inches/inchesPerFeet;
    int yards = feet/feetPerYard;
    int miles = yards/yardsPerMile;
    
    int remYards = yards % 1760;
    int feet2 = remYards*3;
    int remFeet = feet2 % 3;
    int inches2 = remFeet * 12;
    int remInches = inches2%12;
    
    System.out.println(inches + " inches is equivalent to:"); 
    System.out.println("Miles: " + miles + "\nYards: " + remYards 
                  + "\nFeet: " + remFeet + "\nInches: " + remInches);
  }
}
