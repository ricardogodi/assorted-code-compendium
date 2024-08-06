import java.util.Scanner;
public class ExamPractice1 {
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    char choice;
    do {
      String text = typeSafe(scan, "Enter web address:");
      String domainType = "";
      int point1 = text.indexOf('.');
      int point2 = text.indexOf('.', point1 + 1);
      if (text.indexOf(".com") >= 0 && text.indexOf("www.") >= 0) {
        domainType = ("a commercial");
      } else if (text.indexOf(".org") >= 0 && text.indexOf("www.") >= 0) {
        domainType = ("an organization");
      } else if (text.indexOf(".edu") >= 0 && text.indexOf("www.") >= 0) {
        domainType = ("an educational");
      } else if (text.indexOf("www.") >=0) {
        domainType = ("an unknown");
      } else {
        System.out.println("Not a valid web address");
      }
      String domainName = text.substring(point1 + 1 , point2);
      System.out.println("The " + domainName + " domain is " + domainType + " domain.");
      System.out.println("Repeat? Y/N");
      choice = scan.nextLine().toLowerCase().charAt(0);
    } while (choice == 'y');
  }
  public static String typeSafe(Scanner scan, String prompt) {
    System.out.println(prompt);
    String text = scan.nextLine();
    while (text.indexOf("www.") < 0) {
      System.out.println("Not a valid web address! " + prompt);
      text = scan.nextLine();
}
    return text;
  }
}
 