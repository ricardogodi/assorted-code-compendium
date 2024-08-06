/** @author Ricardo Gonzalez
  * @since 02/01/20
  * MTH 244 - Discrete Mathematics
  * Professor Jeffrey Mudrock
  * */

public class AwesomeNumberFactorial {
  
  public static void main (String [] args) {
    
    int noOfDigits = 0;
    int sumOfFactorials = 0;
    
    for (int x = 11; x < 10000000; x++ ) {
      noOfDigits = noOfDigits(x);
      sumOfFactorials = sumOfFactorials(x,noOfDigits);

      if ( sumOfFactorials == x) {
        System.out.println(x + " is an awesome number!");
      }
    }   
  }
  
  public static int noOfDigits(int n) { //count x's number of digits
    
    int noOfDigits = 0;
    
    for (int i = 0; n/(int) Math.pow(10, i) > 0; i++) {
      noOfDigits++;
    }
    return noOfDigits;
  }
  
  public static int sumOfFactorials(int x, int noOfDigits) {  
    
    int sum = 0;
    int digit = 0;
    
    for (int i = 0; i < noOfDigits; i++) {
      digit = (x/(int)Math.pow(10, i))%10;  // 'Extract' digit: ( x/(10^i) )%10
      sum = sum + factorial(digit);
    }
    return sum;
  }
  
  public static int factorial(int n) { //return n!
    
    if(n == 0) {
      return 1;
    }
    
    int recurse = factorial(n-1);
    int result = n * recurse;
    return result;
  }
}