/* PrintFactors application
 * MCS 141
 * 10/9/18
 * */
 
import java.util.Scanner;
 
public class PrintFactors {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    int input;
     
    System.out.println("Enter a positive integer:");
    input = scan.nextInt();
     
    for (int i = 1; i <= input; i++) {
      if ( input % i == 0 ) {
        System.out.println(i);
      }
    }
  }
}