/* Void Demo 2 
 * MCS 141 
 * 9/11/18 
 * */ 
 
import java.util.Scanner; 
 
public class VoidDemo2 { 
   
  public static void isAwesome( String name ) { 
    System.out.println( name + " is awesome!"); 
  } 
   
  public static void isReallyAwesome( String name ) { 
    isAwesome( name ); 
    isAwesome( name ); 
    isAwesome( name ); 
  } 
   

   
  // more printf work 
  public static void printStats(String name, double gpa) { 
    /* prints a single line of table in two columns 
     * Each column is 20 characters wide separated by a "|" 
     * */ 
    System.out.printf("%-20s|%20.2f%n", name, gpa); 
  } 
   
  public static void main( String [] args ) { 
    printStats("Nathaniel",4.0); 
    printStats("Jane", 4.12345678); 
    printStats("Ebineezer", 0.1); 
    printStats("Alice", 3.712); 
     
    isReallyAwesome("CS"); 
  } 
   
  /* Intro to recursion (methods calling themselves) */ 
  public static void badIdea() { 
    System.out.println("I think this was a bad idea..."); 
    badIdea(); 
  } 
   
}