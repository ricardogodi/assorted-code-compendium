import java.util.Scanner;

public class Countup {
  
  public static void countup(int n) {
    if(n== 0) {
      System.out.println("Blastoff!");
    } else {
      countup(n-1);
      System.out.println(n);
     
    }
  }
  
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter number: ");
    int number = input.nextInt();
    
    countup(number);
    
  }
}
    

