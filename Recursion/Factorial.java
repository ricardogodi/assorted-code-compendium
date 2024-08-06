import java.util.Scanner;

public class Factorial {
  
  public static int factorial(int n) {
    if(n == 0) {
      return 1;
    }
    int recurse = factorial(n-1); //If n == 0 this is DEAD CODE       
    int result = n * recurse;
    return result;
  }
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = scan.nextInt();
    factorial(number);
    System.out.println("The factorial of your number is " + factorial(number));
  }
}
