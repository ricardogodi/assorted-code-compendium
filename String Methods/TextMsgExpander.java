import java.util.Scanner;

public class TextMsgExpander {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter text:");
    String text = scan.nextLine();
    System.out.println("You entered: " + text + "\n");

    if (text.indexOf("IDK") >= 0) {
      text = text.replace("IDK","I don't know");
      System.out.println("Replaced \"IDK\" with \"I don't know\".");
    }
    
    if (text.indexOf("BFF") >= 0) {
      text = text.replace("BFF","best friend forever"); 
      System.out.println("Replaced \"BFF\" with \"best friend forever\".");
    }
    
    if (text.indexOf("JK") >= 0)  {
      text = text.replace("JK","just kidding");    
      System.out.println("Replaced \"JK\" with \"just kidding\".");
    }
    
    if (text.indexOf("TMI") >= 0)  {
      text = text.replace("TMI","too much information");
      System.out.println("Replaced \"TMI\" with \"too much information\".");
    }
    
    if (text.indexOf("TTYL") >= 0)  {
      text = text.replace("TTYL","talk to you later");
      System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
    }
     System.out.println();
    System.out.println("Expanded: " + text);
  }
}

