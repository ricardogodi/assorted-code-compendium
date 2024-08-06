import java.util.Scanner;

/** Display multiplying tables
  * */

public class Tables {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    printTable(4);
  }
  
  public static void printTable(int rows) {
    int i = 1;
    while (i <= rows) {
      printRow(i,rows);
      i = i + 1;
    }
  }
  
  public static void printRow(int n, int columns) {
    int i = 1;
    while (i <= columns) {
      System.out.printf("%4d", n * i);
      i = i + 1;
    }
    System.out.println();
  }         
}
