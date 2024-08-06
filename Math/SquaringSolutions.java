/* First solution.  Uses two helper methods.
 * */

//Import the Scanner
import java.util.Scanner;

//Begin class Squaring
public class Squaring Solutions{
  
  //Begin main
  public static void main (String [] args){
    
    //Create variables
    long inpt = 0;
    long count = 0;
    
    //Create Scanner
    Scanner scan = new Scanner(System.in);
    
    //Prompt user
    inpt = inputValidation(scan);
    count = squareToMillion(inpt);
    System.out.printf ("%d exceeded 1,000,000 after %d squarings.%n", inpt, count);
  }
  //Close main
  
  public static long inputValidation(Scanner scan){
    
    //Variable assignment
    long inpt;
    do{
      System.out.println ("Enter an integer greater than 1:");
      
      while (!scan.hasNextLong()){
        String bogusInpt = scan.nextLine(); 
        System.out.println (bogusInpt + " is not valid input.");
        System.out.println ("Enter an integer greater than 1:");
      }
      inpt = scan.nextLong();
      scan.nextLine();
      
      if (inpt <= 1){
        System.out.printf ("%d is not greater than 1.%n", inpt);
      }
    }
    while (inpt <= 1);
    
    return inpt; 
  }
  
  //Begin squareToMillion
  public static long squareToMillion(long n){
    
    long total = 1;
    long count = 0;
    
    System.out.println (n);
    
    for (int i = 1 ; n <= 1000000 ; i++){
      
      n = n * n;
      System.out.println (n);
      count++;
      
    }
    return count;
  }
  //Close squareToMillion
}

//Close Squaring

********************************************************************************
  
  /* Second solution.  All logic handled in main.
   * */
  
  import java.util.Scanner;

public class SquaringSolutions {
  public static void main (String args []) {
    Scanner scan = new Scanner(System.in);
    int input;
    do {
      System.out.println("Enter an integer greater than 1:");
      while (!(scan.hasNextInt()))
      {
        String garbage = scan.nextLine(); // clear out bad data
        System.out.println(garbage + " is not valid input."); 
        System.out.println("Enter an integer greater than 1:");
        //scan.nextLine();
      }
      input = scan.nextInt();
      String garbage2 = scan.nextLine();
      if (!(input > 1)) {
        System.out.println(input + " is not greater than 1.");
      }
    }
    while (!(input > 1));
    
    long x;
    x = input;
    System.out.println(x);
    int count = 0;
    while (x <= 1000000) {
      
      x = x*x;
      System.out.println(x);
      count++;
    } 
    System.out.println(input + " exceeded 1,000,000 after " + count + " squarings.");
  }
}