/* Ricardo Gonzalez
 * Exam Practice 2
 * Professor: Jonatahn Sprague 
 * MCS 141
 * 10/31/18
 * */

import java.util.Scanner;

public class ExamPractice2 {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    int n;
  
    int [] data;
    int sum = 0;
    double mean;
    double [] deviation;
    double devSum = 0;
    
    System.out.print("Enter number of data points: ");
    n = scan.nextInt();
    data = new int[n];
    deviation = new double[n];
    
    //get data
    for (int i = 0; i < data.length; i++) {
      System.out.print("Enter a value for Point " + (i+1) + ":");
      data[i] = scan.nextInt();
      sum = sum + data[i];
    }
    mean = (double) sum / data.length;
    System.out.printf("The mean is: %.4f%n3", mean);
    
    //calculate deviation for each point
    for (int i = 0; i < data.length; i++) {
      deviation[i] = (double) data[i] - mean;
      System.out.printf("The deviation of Point %d is %.2f%n", (i+1), deviation[i]);
      devSum = devSum + deviation[i];
    }
    System.out.println("The deviation sum is: " + devSum); 
  } 
}

