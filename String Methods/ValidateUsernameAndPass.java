import java.util.Scanner;
  
public class ValidateUsernameAndPass {
  
  public static void validateUsername(String username) {
    System.out.printf("Hello %s. Enter your password: ", username);
  }
  
   public static void validatePassword(String password) {
  
    System.out.printf("Please re-enter your password: ", password);
   }
  
   public static void main(String[] args) {
     
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Enter your username: "); 
   String username = scan.nextLine();
   validateUsername(username);
   
   String password = scan.nextLine();
   validatePassword(password);
   
   
     
     
   
   }
}
