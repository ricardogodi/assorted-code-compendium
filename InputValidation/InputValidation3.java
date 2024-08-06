import java.util.Scanner;

public class InputValidation3 {
  
  public static int getValidTypeSafeInt(int low, int high, Scanner input) {
    int n = 0;
    
    do {
      
      System.out.printf("Enter an integer between %d and %d (inclusive):\n", low, high);
      
      while (!input.hasNextInt()) {
        String garbage = input.nextLine();
        System.out.printf("Enter an integer between %d and %d (inclusive):\n", low, high);
      }
      
      n = input.nextInt();
      
    } while (n < low || n > high); 
    
    return n;
    
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    scan.nextLine(); // clear newline character
    int c = getValidTypeSafeInt(a,b,scan);
    System.out.println(c + " is between " + a + " and " + b + ".");
  }
}