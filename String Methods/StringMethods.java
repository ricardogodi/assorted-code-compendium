import java.util.Scanner;

public class StringMethods {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    String text;
    text = scan.nextLine();
    /*
     System.out.println(reverseString(text));
     System.out.println(getLastName(text));
     System.out.println(getFirstName(text));
     System.out.println(countNonWhitespace(text));
     System.out.println(countWords(text));
     */
    System.out.println(countNonWhitespace(text));
  }
  
  public static String reverseString(String string) {
    String reversed = "";
    for (int i = 0; i < string.length(); i++) {
      reversed = string.charAt(i) + reversed;           
    }
    return reversed;
  }
  
  public static String getLastName(String string) {
    String lastName = "";
    int comma;
    for (int i = 0; i < string.length(); i++) {
      comma = string.indexOf(',');
      lastName = string.substring(0 , comma);
    }
    return lastName;
  }
  
  public static String getFirstName(String string) {
    int comma = string.indexOf(',');
    String firstName = string.substring(comma + 2);
    
    return firstName;
  }
  
  public static int countNonWhitespace(String string) {
    int counter = 0;    
    for (int i = 0; i < string.length(); i++) {
      
      if (string.charAt(i) != ' ') {
        counter++;
      }
    }
    return counter;
  }
  
  public static int countWords(String string) {
    int counter = 1;
    for (int i = 0; i < string.length(); i++) {
      
      if (string.charAt(i) == ' ') {
        counter++;      
      } 
    } return counter;
  }
}



