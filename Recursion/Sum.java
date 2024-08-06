 import java.util.Scanner;

public class Sum {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    System.out.print(sum(n));
    
  } 
  
  public static int sum(int n) {
    if (n == 0) {
      return 0;
    } 
    int recurse = sum(n - 1);
    int result = n + recurse;
    return result;
  }
} 