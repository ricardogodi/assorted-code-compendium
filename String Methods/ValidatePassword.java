import java.util.Scanner;

public class ValidatePassword {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your username:"); 
    String username = scan.nextLine();
    
    System.out.printf("Hello %s. Enter your password:\n", username);
    String firstPasswordInput = scan.nextLine();
    
    System.out.print("Please re-enter your password:\n");
    String secondPasswordInput = scan.nextLine();
    
    if (firstPasswordInput.equals(secondPasswordInput)) {
      System.out.println("Passwords Match");
    } else {
      System.out.println("Passwords Do Not Match");
    }
  }
}
