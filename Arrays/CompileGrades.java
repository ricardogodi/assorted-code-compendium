/* Compile grade application
 * MCS 141
 * 10/9/18
 * */

import java.util.Scanner; // to read file
import java.io.File; // to handle file interactions
import java.io.IOException; // in case something goes wrong...

public class CompileGrades {
  public static void main (String [] args) throws IOException {
    // set up variables
    int gradeA = 0;
    int gradeB = 0;
    int gradeC = 0;
    int gradeD = 0;
    int gradeF = 0;
    double average;
    int total = 0;
    int count = 0;
    
    // file interactions
    File inputFile = new File("numbers.txt"); // set up file object to manage file
    Scanner read = new Scanner( inputFile ); // point Scanner to file object
    
    // read file
    while ( read.hasNextInt() ) { // while there is an int to be read
      int input = read.nextInt(); // read int
      total = total + input;
      count++;
      // increment grade counters
      if (input >= 90)
        gradeA++;
      else if (input >= 80)
        gradeB++;
      else if (input >= 70)
        gradeC++;
      else if (input >= 60)
        gradeD++;
      else
        gradeF++;
    } // end while
    
    System.out.print("A: ");
    printStars(gradeA);
    System.out.print("B: ");
    printStars(gradeB);
    System.out.print("C: ");
    printStars(gradeC);
    System.out.print("D: ");
    printStars(gradeD);
    System.out.print("F: ");
    printStars(gradeF);
    
    //print average
    average = (double)total/count;
    System.out.println("\nThe average score was " + average);
  }
  
  public static void printStars(int n) {
    for (int i = 1; i <=n; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}