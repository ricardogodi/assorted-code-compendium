import java.util.Scanner;

public class OddSum  {
  
  public static void main(String [] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    System.out.println(oddSum(n));
  }
  
  public static int oddSum(int n) {
    if (n <= 0) {
      return 0;
    } else if (n % 2 == 0) {
      int m = n - 1;
      int recurse = oddSum(m - 2);
      int result = m + recurse;
      return result;
    } else {
      int recurse = oddSum(n-2);
      int result = n + recurse;
      return result;
    }
  }
}