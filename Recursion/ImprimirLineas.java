import java.util.Scanner;

public class ImprimirLineas {

  public static void nLines(int n) {
   
    if (n>0) {
      System.out.println();
      nLines(n - 1);
    } 
      
  }
      public static void main(String [] pincheperrin) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("How many newlines do you want to display? ");
      int numeroDeLineas = input.nextInt();
        
      nLines(numeroDeLineas); 
      
      System.out.printf("You displayed %d lines\n", numeroDeLineas);
}
  }
  
