import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/***********************************************************
  * Application to demonstrate why randomization algorithms
  * don't swap each element with any element from the list, but
  * only swap with elements from the current position to the end.
  * The number of permutations of n elements grows very quickly
  * with n, so it is recommended to use 3-4 elements, though the
  * application will allow up to 6 (which generates a lot of
  * output, most of which is not terribly useful).
  * ********************************************************/

public class PermutationIllustration {
  final static int TRIALS = 1000000; // number of simulations
  final static int MAX = 6; // max items to permute
  
  public static void main( String [] args ) {
    Scanner scan = new Scanner(System.in);
    char choice;
    
    do {
      // Get input from user:
      System.out.println("How many items would you like to permute? (1-" + MAX + ")");
      int itemCount = getInt(scan);
      
      // Make and print list of items to permute
      String items = makeList(itemCount);
      System.out.println("Items to permute:");
      System.out.println(items);
      
      // Generate list of all permutations
      ArrayList<String> permutations = makePermutations(items);
      System.out.println("There are " + permutations.size() + " possible orderings.");
      
      // Initialize counter arrays
      int [] pCount = new int[permutations.size()];
      int [] pCountSmart = new int[permutations.size()];
      
      /* Run simulation TRIALS times.
       * Each trial, generate a random permutation, and then increment
       * the counter corresponding to the matching permutation
       * in the master list.
       * */
      for (int i = 0; i < TRIALS; i++) {
        String r1 = randomize(items);
        pCount[permutations.indexOf(r1)]++; 
        String r2 = smartRandomize(items);
        pCountSmart[permutations.indexOf(r2)]++;
      }
      
      // Output results
      System.out.println();
      System.out.printf("%-14s%-16s%-16s%n", "","Simple", "Smart");
      System.out.printf("%-14s%-16s%-16s%n", "Permutation","Randomization", "Randomization");
      for (int i = 0; i < permutations.size(); i++) {
        System.out.printf("%-14s%11.1f%%    %11.1f%%%n",
                          permutations.get(i),
                          100.0*pCount[i]/TRIALS,
                          100.0*pCountSmart[i]/TRIALS);
      }
      
      // Restart simulation
      System.out.println();
      System.out.println("Run again? <y/n>");
      choice = scan.nextLine().toLowerCase().charAt(0);
    } while (choice == 'y');
  }
  
  /*******************************************************
    * Typesafe method to get an int.  Will return
    * an int between 1 and the static constant MAX (inclusive).
    * @param scan a Scanner for input
    * @return an int between 1 and MAX (inclusive)
    * ****************************************************/
  public static int getInt(Scanner scan) {
    int value;
    do {
      while (!scan.hasNextInt() ) {
        String garbage = scan.nextLine();
        System.out.println("Please enter an integer: (1-" + MAX + ")");
      }
      value = scan.nextInt();
      scan.nextLine();
      if (value > MAX || value <= 0)
        System.out.println("Please enter an integer: (1-" + MAX + ")");
    } while (value <= 0 || value > MAX);
    return value;
  }
  /*******************************************************
    * Generates a String of characters of the requested
    * size, starting with 'A'.
    * @param size the number of elements in the String
    * @return a String of the requested length
    * ***************************************************/
  public static String makeList(int size) {
    String list = new String();
    for (int i = 0; i < size; i++) {
      list += (char)('A' + i);
    }
    return list;
  }
  
  /*******************************************************
    * Generates all permutations of the provided String.  Assumes
    * all elements of the String are distinguishable.
    * @param list the elements to be permuted
    * @return an ArrayList of permutations
    * ****************************************************/
  public static ArrayList<String> makePermutations(String list) {
    ArrayList<String> permutations = new ArrayList<String>(factorial(list.length()));
    String original = new String(list);
    permute(original,"", permutations);
    return permutations;
  }
  
  /*******************************************************
    * Simple factorial function for small input values.
    * @param n the number to take the permutation of
    * @return n!
    * ****************************************************/
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <=n; i++) {
      result *= i;
    }
    return result;
  }
  
  /*******************************************************
    * Recursive method to generate all permutations of a String.
    * For the initial call, "current" should be an empty String.
    * Permutations are added to the ArrayList provided as a parameter.
    * @param original the String to permute
    * @param current a partial permutation (should be "" in the initial call)
    * @param permutations the ArrayList to store the permutations in
    * ******************************************************/
  public static void permute(String original, String current, ArrayList<String> permutations) {
    if (original.length() == 0) {
      permutations.add(current);
      //System.out.println(current);
      return;
    }
    for (int i = 0; i < original.length(); i++) {
      String thisCurrent = current + original.charAt(i);
      StringBuilder temp = new StringBuilder(original);
      String thisOriginal = temp.deleteCharAt(i).toString();
      permute(thisOriginal, thisCurrent, permutations);
    }
  }
  
  /*******************************************************
    * Naive randomization method.  Randomizes the provided String
    * by swapping each element in the String with a random element
    * from the entire String.
    * @param list the String to randomize
    * @return a randomized String
    * *****************************************************/
  public static String randomize(String list) {
    StringBuilder temp = new StringBuilder(list);
    for (int i = 0; i < temp.length(); i++) {
      int rand = (int)(temp.length()*Math.random());
      char swap = temp.charAt(rand);
      temp.setCharAt(rand, temp.charAt(i));
      temp.setCharAt(i,swap);
    }
    return temp.toString();
  }
  
  /*******************************************************
    * Randomization method.  Randomizes the provided String by
    * swapping each element of the String with an element from
    * the current index to the end.
    * @param list the String to randomize
    * @return a randomized String
    * *****************************************************/
  public static String smartRandomize(String list) {
    StringBuilder temp = new StringBuilder(list);
    for (int i = 0; i < temp.length(); i++) {
      int rand = i+(int)((temp.length()-i)*Math.random());
      char swap = temp.charAt(rand);
      temp.setCharAt(rand, temp.charAt(i));
      temp.setCharAt(i,swap);
    }
    return temp.toString();
  }
  
}