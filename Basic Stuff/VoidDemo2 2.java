/* Void Demo 2
 * MCS 141
 * 9/11/18
 * */

import java.util.Scanner;

public class VoidDemo2 {
  
  public static void isAwesome(String name) {   //methods dont always need parameters but usually need them
    System.out.println( name + " is awesome!");
  }
  
  public static void isReallyAwesome(String name) {
    isAwesome( name );
    isAwesome( name );
    isAwesome( name );
  }
  
  public static void methodCallExample() {
    //how to call a method from a different class
    System.out.println("Calling method from VoidDemo from within VoidDemo2");
    VoidDemo.distance(1,2,3,4);   
  }
  
  public static void printStats(String name, double gpa) {
    /*prints a single line of table in two columns
     * Each column is 20 characters wide separated by a "|"
     * */
    
    System.out.printf("%-20s|%20.2f\n", name, gpa);   
  }
  
  public static void main(String [] args) {
    printStats("Delia", 4.34234);
    printStats("Ricardo", 54.243356465);
    printStats("Daniel", 243.4567);
    printStats("Pedro", 567.425436);
    
    isReallyAwesome("CS");
    
    badIdea();
  }
  
  /*intro to recursion
   * /
   * */
  public static void badIdea() {
    System.out.println("I think this was a bad idea...");
    badIdea();
    
    //It's gonna stop eventually until you run out of memory. It's called StackOverFlow
  } 
}




