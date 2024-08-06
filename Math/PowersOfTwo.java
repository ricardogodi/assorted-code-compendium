import java.util.Scanner;

public class PowersOfTwo {
  
  public static void main (String [] args) {
    
    int [] array = new int[11];
    
    for (int i = 0; i <= 10; i++) {
      array[i] = (int) Math.pow(2.0, i);
    }
    
    
    do  {
      
      int num = (int) ((Math.random()*100 + 1)/10);
      
      
      System.out.println(array[num]);
      
      Scanner scan = new Scanner(System.in);
      
      int guess = scan.nextInt();
      
      
      
      if (guess == num) {
        
        System.out.println("Correct"); 
      }
      else 
        System.out.println("Incorrect"); 
      
      
      
      
      
    } while (true);
    
    
    
  }
}