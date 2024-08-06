import java.util.Scanner;

public class Mult  {
  
  public static void main(String [] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int a = scan.nextInt();
    System.out.println("Enter another positive integer:");
    int b = scan.nextInt();
    System.out.println(mult(a,b));
  }
  
  public static int mult(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    else {
      int recurse = mult(a, b-1);
      int result = a + recurse;
      return result;
    }
  }
}