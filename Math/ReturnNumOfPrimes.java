import java.util.Scanner;

public class ReturnNumOfPrimes {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many numbers?");
    int qty = scan.nextInt();
    int [] numbers = new int[qty];
    
    for (int i = 0; i < numbers.length; i++) {
    System.out.println("Enter a number for index " + (i));
    numbers[i] = scan.nextInt();
    }
    
    System.out.println(countPrimes(numbers));
  }
  
  public static int countPrimes (int [] numbers) {
    int counter = 0;
    boolean flag = false;
    
    for (int i = 0; i < numbers.length; i++) {
      
      if (numbers[i] <= 1) {
        flag = false;
      }
      
      if (numbers[i] == 2) {
        flag = true;
      }
      
      for (int n = 2; n < numbers[i]; n++) {
        if (numbers[i] % n == 0) { 
          flag = false;
          break;
        } else flag = true;
      } 
      
      if (flag) {
        counter++; 
      }
    }
    return counter;
  }
}

