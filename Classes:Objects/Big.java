import java.math.BigInteger;
import java.util.Scanner;

public class Big {
  
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Display factorials up to what number?");
    int n = scan.nextInt();
    factorial(n);
  }
  
  public static BigInteger factorial(int n) {
    
    BigInteger limit = BigInteger.valueOf(n);
    BigInteger i = BigInteger.valueOf(1);
    BigInteger total = BigInteger.valueOf(1);
    BigInteger one = BigInteger.valueOf(1);   
    
    while (i.compareTo(limit) <= 0){
      total = total.multiply(i);
      System.out.println(total);
      i = i.add(one);
    }
    return total;
  }
}
