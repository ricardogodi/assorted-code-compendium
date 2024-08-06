import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ReadFiles {
  public static void main(String[] args) throws IOException {
    Scanner console = new Scanner(System.in);
    String fileName = console.nextLine();
    File inputFile = new File(fileName);
    Scanner read = new Scanner(inputFile);
    int sum = 0;
    int count = 0;
    double mean = 0;
    while(read.hasNextInt()) {
      int input = read.nextInt();
      sum = sum + input;
      count++;
      mean = (double) sum/count;
}
    System.out.println("Sum: " + sum);
    System.out.println("Count: " + count);
    System.out.printf("Mean: %.2f\n", mean);
} }