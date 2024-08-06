import java.util.Scanner;

public class InputValidation2 {
   
   public static int getTypeSafeInt(String prompt, Scanner input) {
      int n;
      System.out.println(prompt);
    
     
     while (!input.hasNextInt()) {
       String garbage = input.nextLine();
       System.out.println(prompt);
     }
     n = input.nextInt();
     return n;
   }
     
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String prompt = scan.nextLine();
      int c = getTypeSafeInt(prompt,scan);
      System.out.println(c + " is a valid int.");
   }
}