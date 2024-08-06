 /* REVISED VERSION
 * Compile Grades Application
 * Reads grades from a file
 * Prints tally of As, Bs, etc.
 * Prints average
 * Uses an array for the counters
 * MCS 141
 * 3/6/18
 * */
 
import java.util.Scanner; // to read file
import java.io.File; // to handle file interactions
import java.io.IOException; // in case something goes wrong
 
public class CompileGradesRevised {
  public static void main(String [] args) throws IOException {
    // set up variables
    int [] gradeCounters = new int [5]; // A -> index 0, F -> index 4
    double average;
    int total = 0;
    int count = 0;
    // file interactions
    File inputFile = new File("numbers.txt"); // set up File object to manage file
    Scanner read = new Scanner(inputFile); // point Scanner to the File object
     
    // read file
    while (read.hasNextInt()) { // while there is integer data to be read
      int input = read.nextInt();
      total = total + input;
      count++;
      // increment grade counters
      if (input >= 90)
        gradeCounters[0]++;
      else if (input >= 80)
        gradeCounters[1]++;
      else if (input >= 70)
        gradeCounters[2]++;
      else if (input >= 60)
        gradeCounters[3]++;
      else
        gradeCounters[4]++;
    }
     
    System.out.print("A: ");
    printStars(gradeCounters[0]);
    System.out.print("B: ");
    printStars(gradeCounters[1]);
    System.out.print("C: ");
    printStars(gradeCounters[2]);
    System.out.print("D: ");
    printStars(gradeCounters[3]);
    System.out.print("F: ");
    printStars(gradeCounters[4]);
     
    //print average
    average = (double)total/count;
    System.out.println("\nThe average score was " + average);
     
  }
   
  public static void printStars(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.print("*");
    } // end of for
    System.out.println();
  } // end of method
}