import java.util.Scanner;

public class Countdown {
  
  public static void countdown(int n) {
    if (n== 0) {
      System.out.println("Blastoff!");
    } else {
      System.out.println(n);
      countdown(n - 1);
    }
  }
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a number, dude: ");
    int number = scan.nextInt();
    
    countdown(number);
    
 
  }
 
}
    

