import java.util.Scanner;

public class ArrayMethods {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many numbers?");
    int qty = scan.nextInt();
    int [] numbers = new int[qty];
    
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter a number for index " + (i));
      numbers[i] = scan.nextInt();
    }
    
    System.out.println(maxIndex(numbers));
    System.out.println(sumSquares(numbers));
    System.out.println(allPositive(numbers));
    System.out.println(countPrimes(numbers));
  }
  
  public static int maxIndex (int [] numbers) {
    int index = 0;
    int largestNumber = numbers[0]; //if largestNumber = 0 It won't work on negative numbers
    for (int i = 0; i < numbers.length; i++) {
      if (largestNumber < numbers[i]) {
        index = i;
        largestNumber = numbers[i];
      }
    }
    return index;
  }
  
  public static int sumSquares (int [] numbers) {
    int squared = 0;
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
      squared = numbers[i] * numbers[i];
      total = total + squared;
    }
    return total;
  }
  
  public static boolean allPositive(int [] numbers) {   
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] <= 0) {
        return false;
      }
    }
    return true;
  }
  
  public static int countPrimes (int [] numbers) {
    int counter = 0;
    
    for(int i = 0; i < numbers.length; i++) {
      if (isPrime(numbers[i])) {
        counter++; 
      }
    }
    return counter;
  }
  

  public static boolean isPrime(int n) {
    if ( n <= 1) {
      return false;
    }
    
    for (int i = 2; i < n; i++) {
      if ( n % i == 0 ) { 
        return false;
      }
    }
    return true;
  } 
}
