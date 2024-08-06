import java.util.Scanner;

public class Power  {
  
  public static void main(String [] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int a = scan.nextInt();
    System.out.println("Enter another positive integer:");
    int b = scan.nextInt();
    System.out.println(power(a,b));
  }
  
  public static int power(int m, int n) {
    if (n == 0) {
      return 1;
    } 
    int recurse = power(m, n - 1);
    int result = m * recurse;
    return result;
  } 
}