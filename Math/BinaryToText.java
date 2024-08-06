import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;  // to handle writing to files
 
/** Binary to Text
  * MCS 141
  * 10/30/18
  * */
 
public class BinaryToText {
  public static void main(String [] args) throws IOException {
    Scanner scan = new Scanner(System.in); // read console
    System.out.println("Enter the name of the file to be read:");
    String fileName = scan.nextLine();
     
    //File interactions
    File file = new File(fileName);
    Scanner read = new Scanner(file); // read file
     
    //Conversion
    String text = "";
    while (read.hasNext()) {
      String currentString = read.nextLine();
      String newText = toText( currentString );
      text = text + newText;
    }
     
    //Output
    File outFile = new File ("output.txt");
    PrintWriter pw = new PrintWriter(outFile); // associate PrintWriter with output file
    pw.println( text ); // PrintWriter works just like System.out
    pw.close();
    /* make sure we close the PrintWriter to make sure the buffer
     * gets flushed to the file before the application ends. */
  }
   
  /** toDecimal method converts a binary String to an integer value
    * @param binary a binary String
    * @return an int with the base 10 value equal to the input
    * */
  public static int toDecimal(String binary) {
    int sum = 0;
    for (int i = 0; i < binary.length() ; i++ ) {
      if (binary.charAt(i) == '1') {
        sum = sum + (int)Math.pow(2, binary.length()-1-i);
      }
    }
    return sum;
  }
   
  /** toChar method converts an 8-bit binary String to the corresponding char
    * @param binary a binary String
    * @return a char representing the binary String
    * */
  public static char toChar(String binary) {
    int value = toDecimal(binary);
    return (char)value;
  }
   
  /** toText method converts a binary String to a String of ASCII characters
    * @param binary a binary String
    * @return a String of ASCII characters
    * */
  public static String toText(String binary) {
    String output = "";
    for (int i = 0; i < binary.length() ; i = i+8) {  // step size 8
      String current = binary.substring(i, i+8); // gets substring
      char nextChar = toChar( current );
      output = output + nextChar;
    }
    return output;
  }
}