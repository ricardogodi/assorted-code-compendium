/* Read and write demo
 * Using try and catch
 * Reads in a file and outputs the result in reverse
 * MCS 141
 * 11/29/18
 * */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ReadAndWrite {
  public static void main (String [] args) {
    StringBuilder input = new StringBuilder();
    try { // check for FileNotFoundException
      Scanner file = new Scanner(new File("input.txt"));
      while (file.hasNext()) {
        input.append(file.nextLine());
        input.append("\r\n"); // to get the correct newline
      }
      // input now holds all text from file
      //System.out.println(input);
      StringBuilder backwards = new StringBuilder();
      for (int i = input.length() - 1; i >= 0; i--) {
        backwards.append(input.charAt(i));
      }
      //System.out.println(backwards);
      //now write to file
      try { // inner try for writing
        FileOutputStream fos = new FileOutputStream("output.txt", false); 
        // false means overwrite the file, true means append

        PrintWriter pw = new PrintWriter(fos);
        pw.println(backwards);
        pw.close();
      } // end of inner try
      catch (FileNotFoundException fnfe) { // catch for inner try
        System.out.println("Cannot write to output.txt");
      }
    }// end of outer try
    catch (FileNotFoundException fnfe) { // catch for outer try
      System.out.println("Cannot open input.txt");
    }
    catch (Exception e) { // catches all other exceptions
      e.printStackTrace(); // prints diagnostic data (the default behavior if we don't catch exceptions)
    }
  } // end main
  
} // end class
                    