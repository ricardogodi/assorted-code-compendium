import java.util.Scanner;

/**
 * Converts centimeters to feet and inches.
 */

public class ConvertCmToFeetAndInches {
  public static void main(String[] args) {
    double cm;
    int feet, inches, remainder;
    final double CM_PER_INCH =  2.54;
    final int IN_PER_FOOT = 12;
    Scanner hey = new Scanner(System.in);
    
    //prompt the user and get the value
    System.out.print("Exactly how many cm? ");
    cm = hey.nextDouble();
    
    //convert and output the result
    inches = (int) (cm / CM_PER_INCH);
    feet = inches / IN_PER_FOOT;
    remainder = inches % IN_PER_FOOT;
    System.out.printf("%.3f cm = %d ft, %d in\n", cm, feet, remainder);
  }
}


