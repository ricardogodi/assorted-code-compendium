import java.util.Scanner;

public class BooleanMethods {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    
    
    System.out.println(isDivisible(15,4));
    System.out.println(isPerfectSquare(121));
    System.out.println(isTriangle(2,4,6));
  }
  
  public static boolean isDivisible(int a, int b) {
    return (a % b == 0);
  }
  
  public static boolean isPerfectSquare(int a) {
    double square = Math.sqrt(a);
    
    int integer = (int) square;
    
    return (integer * integer == a);
  }
  
  public static boolean isTriangle(double a, double b, double c) {
    return ((a + b > c) && (a + c > b) && (b + c > a));
  }
}