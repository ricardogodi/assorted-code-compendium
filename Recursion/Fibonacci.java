import java.util.Scanner;

public class Fibonacci  {
  
  public static void main(String [] args) {
    
  Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int n = scan.nextInt();
    System.out.println(fibonacci(n));
  }
  
  public static int fibonacci( int n ) { 
    if (n == 1 || n == 2) {
      return 1; 
    }
    return fibonacci(n-1) + fibonacci(n-2); 
  }
}