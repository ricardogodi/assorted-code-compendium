/* Using arrays as counters
 * MCS 141
 * 3/8/18
 * Randomly generates "n" rolls of a six-sided dice and counts the numbers of
 * occurances of each outcome.
 * */
 
import java.util.Scanner;
 
public class CounterArray {
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    int n; // number of trials
    int [] counts = new int [7];  // so we can use elements 1-6 (0 is ignored)
     
    System.out.println("How many rolls?");
    n = scan.nextInt();
     
    // generate rolls
    for (int i = 1; i <= n; i++) {
      int roll = (int)(6*Math.random() + 1);  // could also have used Random class
      // increment counters
      counts[roll]++;
    }
     
    // print results
    for (int i = 1; i < counts.length; i++) {
      System.out.printf("%d's:  %d%n", i, counts[i]);
    }
  }
}