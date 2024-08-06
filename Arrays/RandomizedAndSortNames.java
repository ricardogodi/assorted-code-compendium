import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
/* RandomizeAndSortNames
 * Modified from SearchNames
 * MCS 141
 * 11/20/18
 * */
public class RandomizeAndSortNames {
  public static void main (String [] args) throws IOException {
    String [] names = new String [100000]; // there are better ways...
    int index = 0; // points to the next location to store data
    File file = new File("sortednames.txt");
    Scanner read = new Scanner(file);
    while (read.hasNext()) {
      names[index] = read.nextLine();
      index++; // update for next read
}
    // clean up array
    String [] temp = new String [index];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = names[i];
    }
names = temp;
    // debug:
    //System.out.println(names.length);
    randomize(names);
    //System.out.println(names.length);
    // write randomized names to a file
    File randomFile = new File("randomnames.txt");
    PrintWriter write = new PrintWriter(randomFile);
    //int count = 0;
    for (int i = 0; i <names.length; i++) {
      write.println(names[i]); // PrintWriter works like System.out
//count++; }
    //System.out.println(count);
    write.close(); // flush remaining data to file
    //sort data!
    selectionSort(names);
    File sortFile = new File("selectionsort.txt");
    write = new PrintWriter(sortFile);
    for (String n : names) { // enhanced for loop
      write.println( n );
    }
    write.close();
  }
  public static void swap(String [] array, int index1, int index2) {
    String temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}
 
  public static void randomize(String [] array) {
    for (int i = 0; i < array.length; i++) {
      int n = (int)(Math.random() * (array.length - i)) + i; // select index
      swap( array, i, n);
    }
}
  public static void selectionSort(String [] array) {
    for (int i = 0; i < array.length; i++) {
      // find smallest element from i to end
      int minIndex = i; // assume 1st element is smallest
      for (int j = i; j < array.length; j++) {
        if (array[j].compareTo(array[ minIndex ]) < 0) {
          minIndex = j;
} }
      swap( array, i, minIndex );
    }
} }
 