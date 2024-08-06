/* Ricardo Gonzalez
 * MCS 141
 * Professor: Jonathan Sprague
 * 11/04/18
 * Rolling Dice Project.
 * My program counts the number of outcomes that 
 * rolling 'd' numbers of dice would give, then 
 * displays a table showing the result, percentage
 * and a histogram.
 * If any number of outcomes exceeds 50, the histogram 
 * is modified proportionally based on that outcome.
 * */

import java.util.Scanner;
import java.util.Random;

public class RollingDiceProject {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    int d;
    int n;
    int [] counts;
    double [] percentage;
    Random generator = new Random();
    String choice;
    int maximum = 0;
    
    do {
      d = getInt("How many dice?", scan);
      scan.nextLine();
      n = getInt("How many trials?", scan);
      scan.nextLine();
      counts = new int[d*6 - (d-1)];
      percentage = new double[d*6 - (d-1)];
      
      for (int i = 1; i <= n; i++) {
        int roll = generator.nextInt((d*6) - (d - 1)) + d; 
        counts[roll - (d)]++;
      }
      
      //Find maximum
      maximum = findMaximum(counts);
      System.out.println("The maximum is: " + maximum + "\n");
      
      //Percentage
      for (int i = 0; i < counts.length; i++) {
        percentage [i] = (double) (counts[i]*100) / n;
      }
      
      //Display table
      System.out.printf("%-10s %-10s %-10s %-10s", "Outcome","Number","Percent", "Histogram\n\n");
      
      for (int i = 0; i < counts.length; i++) {
        System.out.printf("%7d %9d %10.1f%%    %-10s", d+i, counts[i], percentage[i], printStars(counts[i], maximum));
        printStars(counts[i], maximum);
        System.out.println();
      }
      System.out.println();
      
      countStars(scan);
      
      choice = getChoice("Do you want to do it again? Yes/No", scan);
      
    } while (choice.equals("yes"));
    
    System.out.println("Okay, good Bye!");
  }
  
  public static String printStars(int n, int maximum) {
    String stars = "";
    
    //In case maximum exceeds 50, display a proportional histogram based on that number
    if (maximum >= 50) {      
      for (int i = 1; i <= (int) (n*50/maximum); i++) {  
        stars = stars + "*"; 
      } 
    } else {
      for (int i = 1; i <= n; i++) { 
        stars = stars + "*"; 
      } 
    }
    return stars;
  }
  
  
  
  
  
  
  public static String getChoice(String prompt, Scanner scan) {
    String input;
    System.out.println(prompt);
    
    do {
      input = scan.nextLine();
      input = input.toLowerCase();
      
      if (!(input.equals("yes")) && !(input.equals("no"))) {
        System.out.println("Type \"Yes\" or \"No\":");
      }
    } while (!(input.equals("yes")) && !(input.equals("no")));
    
    return input;
  }
  
  public static int getInt(String prompt, Scanner scan) {
    int n;
    System.out.print(prompt);
    
    while (!scan.hasNextInt()) {
      String garbage = scan.nextLine();
      System.out.println(garbage + " is not valid input");
      System.out.println(prompt);
    }
    n = scan.nextInt();
    System.out.println();
    return n;
  } 
  
  public static int findMaximum(int [] counts) {
    int maximum = counts[0];
    
    for (int i = 0; i < counts.length; i++) {
      if (maximum < counts[i]) {
        maximum = counts[i];
      }
    }
    return maximum;
  }
  public static void countStars(Scanner scan) {
    int counter = 0;
    System.out.print("Enter number of stars: ");
    String stars = scan.nextLine();
    for (int i = 0; i < stars.length(); i++) {
      
      if (stars.charAt(i) != ' ') {
        counter++;
      }
    }
    System.out.println();
    System.out.println("Number of stars: " + counter);
    System.out.println();
  }
  
  public static int maxIndex (int [] counts) {
    int index = 0;
    int largestNumber = counts[0];
    for (int i = 0; i < counts.length; i++) {
      if (largestNumber < counts[i]) {
        index = i;
        largestNumber = counts[i];
      }
    }
    return index;
  }
}