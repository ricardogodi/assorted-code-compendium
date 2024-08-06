import java.util.Scanner;

public class ConvertCtoF {
   public static void main(String[] args) {
     
   
    double celsius;
    double fahrenheit;
    
    
    Scanner in = new Scanner(System.in);
    
  
    System.out.print("Enter a temperature in Celsius:\n");  
    celsius = in.nextDouble(); 
                                    

    fahrenheit = (celsius*(double) 9/5)+32;
      
    System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    
  }
}
    
    
    
    
   