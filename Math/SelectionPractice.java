import java.util.Scanner;
  
public class SelectionPractice{
  
  public static void multipleOf5 (int a) {
    if ( a % 5 == 0) {
      System.out.printf("%d is a multiple of 5\n", a);
    }
  }
    
  public static void endInZero (int a) {
    if ( a % 10 == 0) {
      System.out.printf("%d ends in zero\n", a);
    } else {
      System.out.printf("%d does not end in zero\n", a);
    }
  }
    
  public static void multipleOf2or3orBoth(int a) {
    if ((a % 2 == 0) && ( a % 3 == 0)) {                             //Evaluate two conditions
      System.out.printf("%d is a multiple of both 2 and 3\n", a);
    } else if (a % 2 == 0) {
      System.out.printf("%d is a multiple of 2\n", a);
    } else if ( a % 3 == 0) {
      System.out.printf("%d is a multiple of 3\n", a);
    }
  }
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter an integer:");
    int number = scan.nextInt();
    
    multipleOf5(number);
    endInZero(number);
    multipleOf2or3orBoth(number);
  }
}
  
  
  
  