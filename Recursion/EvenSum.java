import java.util.Scanner;

public class EvenSum  {
  
  public static void main(String [] args) {
    
  Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    System.out.println(evenSum(n));
  }
  
    public static int evenSum(int n) {
    if (n <= 0) {
      return 0;
    } else if (n % 2 == 0) {
      int recurse = evenSum(n - 2);
      int result = n + recurse;
      return result; 
    } else {
      int m = n - 1;
      int recurse = evenSum(m - 2);
      int result = m + recurse;
      return result;
    }
  } 
}