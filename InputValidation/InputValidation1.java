import java.util.Scanner;

public class InputValidation1 {
  
  public static int getValidInt(int low, int high, Scanner input) {
    int a;
    
    do {
      System.out.printf("Enter an integer between %d and %d (inclusive:)\n", low, high);
      
      a = input.nextInt();
      
    } while (a < low || a > high);
    return a;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = getValidInt(a,b,scan);
    System.out.println(c + " is between " + a + " and " + b + ".");
  }
}


