import java.util.Scanner;

public class RiemannSum {
  
  public static void main (String [] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter Lower Bound:");
    double a = scan.nextInt();
    
    System.out.println("Enter Upper Bound:");
    double b = scan.nextInt();
    
    System.out.println("Enter Number of Partitions:");
    double n = scan.nextInt();
    
    System.out.println("Area under ln(x) from a = " + a + " to b = " + b + "\n");
    System.out.println("OverEstimate: " + area(a,b,n,true));
    System.out.println("More Precise Approximation: " + area(a,b,10000000,true));
    System.out.println("UnderEstimate: " + area(a,b,n,false));
  }
  
  public static double area(double a, double b, double n, boolean flag) {
    
    double sum = 0;
    double width = (b-a)/n;
    double height;
    
    if (flag) {
      for(int i = 1; i <= n; i++) {      //overestimate
        height = f(a + i*(width));
        sum = sum + width*height;
      }
      return sum;
    } else {
      for(int i = 0; i < n; i++) {      //underestimate
        height = f(a + i*(width));
        sum = sum + width*height;
      }
      return sum;
    }
  }
  
  public static double f(double x) {
    return Math.log(x); 
  }
  
}