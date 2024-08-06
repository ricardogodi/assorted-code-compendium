import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean a = scan.nextBoolean();
    boolean b = scan.nextBoolean();
    boolean c = scan.nextBoolean();
    
    //write a line of code that will print true 
    //when both **a** and **b** are true, but false otherwise.
    System.out.println( a && b );
    
    //write a line of code that will print true when
    //at least one of **a** and **b** are true, but false otherwise.
    System.out.println( a || b );
    
    //write a line of code that will print true when 
    //**a** and **c** are true, but **b** is false.  Print false otherwise.
    System.out.println(( a && c ) && !b);
    
    //write a line of code that will print false when 
    //**b** is true, regardless of the other variables.  Print true if **b** is false.
    System.out.println(!b);
    
    //write a line of code that will print true if 
    //**a** is true, or if **b** and **c** are both false.  Print false otherwise.
    System.out.println( a || (!b && !c));
  }
}
