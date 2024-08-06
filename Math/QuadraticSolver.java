/** Ricardo Gonzalez Diaz
  * MCS 141
  * 09/17/18
  * Professor: Jonathan Sprague
  * 
  * Name of the Project: Quadratic Solver
  * 
  * Description: My program finds the real solutions 
  * of a quadratic equation in standard form. 
  * Conditional Statements are aplied to 
  * evaluate the Discriminant and display 
  * the corresponding solutions.
  */

import java.util.Scanner;

public class QuadraticSolver {
  
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the coefficients of the equation Ax^2 + Bx + C = 0:");
    System.out.println("A:");
    double a = scan.nextDouble();
    System.out.println("B:");
    double b = scan.nextDouble();
    System.out.println("C:");
    double c = scan.nextDouble();
    
    double discriminant = ( Math.pow( b, 2.0) - ( 4 * a * c) );    //Discriminant
    
    //Calculations for (-b PLUS sqrt(Discriminant))/2a
    double solutionOne = (( (-1) * (b) ) + ( Math.sqrt(discriminant))) / (2 * a);   
    
    //Calculations for (-b MINUS sqrt(Discriminant))/2a
    double solutionTwo = (( (-1) * (b) ) - ( Math.sqrt(discriminant))) / (2 * a);   
    
    if ( discriminant == 0 ) {                                                 //
      System.out.printf("%.6f is a repeated solution.\n", solutionOne);
    } else if ( discriminant > 0 ) {
      System.out.printf("The solutions are %.6f and %.6f"+"."+"\n",solutionOne, solutionTwo);
    } else {
      System.out.printf("There are no real solutions.\n");
    }   
  }
}

