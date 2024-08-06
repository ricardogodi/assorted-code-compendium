import java.io.File;
import java.util.Scanner;
import java.io.IOException;
 
/* SearchNames class
 * MCS 141
 * 11/15/18
 * */
 
public class SearchNames {
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
     
    // application loop
    Scanner scan = new Scanner(System.in);
    String target;
    do {
      System.out.println("Enter a name to search for: (type \"quit\" to quit)");
      target = scan.nextLine();
      if ( !target.equals("quit") ) {
        int loc = binarySearch(names, target);
        //int loc = seqSearch(names, target);
        if (loc == -1) {
          System.out.println(target + " not found");
        }
        else {
          System.out.println(target + " found at index " + loc);
        }
      }
    } while (!target.equals("quit") );
    System.out.println("Goodbye!");
  }
   
  // Sequential Search
  public static int seqSearch( String [] array, String target ) {
    for (int i = 0; i < array.length; i++) {
      //System.out.printf("%d: Checking %s in seqSearch%n", (i+1), array[i]);
      if ( array[i].equalsIgnoreCase(target) ) {
        return i;
      }
    }
    return -1;
  }
   





  // Binary search
  public static int binarySearch(String[] array, String target) {
    int cycles = 1;
    int low = 0;
    int high = array.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2; // step 1
      System.out.printf("%d: Checking %s in binarySearch%n", cycles++, array[mid]);
      int comp = array[mid].compareToIgnoreCase(target);
      if (comp == 0) { // step 2
        return mid;
      } else if (comp < 0) { // step 3
        low = mid + 1;
      } else { // step 4
        high = mid - 1;
      }
    }
    return -1;
  }
   
}