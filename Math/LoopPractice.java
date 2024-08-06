public class LoopPractice {
  
  public static int sum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    return sum;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static int oddSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i = i + 2) {
      sum = sum + i;
    }
    return sum; 
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static int power(int base, int exponent) {
    int result = base;
    for (int i = 1; i < exponent; i++) {
      result = result * base ;
    }
    return result;
  }
}



