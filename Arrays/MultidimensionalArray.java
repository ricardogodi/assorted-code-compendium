import java.util.Arrays;
/* Multi-dimensional array practice
 * MCS 141
 * 10/23/18
 * */
 
public class MultiArray {
  public static void main (String [] args) {
    // set up arrays
    int [][] numbers = new int [5][8];  // array w/ 5 rows 8 columns
    int [][] strange = { {1,2,3}, {4,5}, {7,8,9,10} }; // not all the same length!
     
    // fill numbers with values 1-100
    for (int row = 0; row < numbers.length; row++) {
      for (int column = 0; column < numbers[row].length; column++ ) {
        numbers[row][column] = (int)(100*Math.random() + 1);
      } // close inner loop
    } // close outer loop
     
    System.out.println("Memory location of numbers array: " + numbers);
     
    System.out.println("Array of memory locations: " + Arrays.toString(numbers) );
     
    System.out.println("Print data using Arrays class:");
    System.out.println("Using deepToString: " + Arrays.deepToString(numbers) );
    for (int row = 0; row < numbers.length; row++) {
      System.out.println(Arrays.toString(numbers[row]) );
    }
     
    System.out.println("Print w/o Arrays class:");
    for (int row = 0; row < numbers.length; row++) {
      for (int column = 0; column < numbers[row].length; column++ ) {
        System.out.print(numbers[row][column] + " ");
      } // end of inner loop
      System.out.println();
    } //end of outer loop
     
    System.out.println("Strange is length: " + strange.length);
    for (int row = 0; row < strange.length; row++) {
      for (int column = 0; column < strange[row].length; column++ ) {
        System.out.print(strange[row][column] + " ");
      } // end of inner loop
      System.out.println();
    } //end of outer loop
     
    System.out.println("Total of elements in numbers:");
    int total = 0;
    for (int row = 0; row < numbers.length; row++) {
      for (int column = 0; column < numbers[row].length; column++ ) {
        total = total + numbers[row][column];
      } // end of inner loop
    } //end of outer loop
    System.out.println(total);
     
    System.out.println("Number of values above 50:");
    int count = 0;
    for (int row = 0; row < numbers.length; row++) {
      for (int column = 0; column < numbers[row].length; column++ ) {
        if (numbers[row][column] > 50) {
          count++;
        }
      } // end of inner loop
    } //end of outer loop
    System.out.println(count);
  }
}