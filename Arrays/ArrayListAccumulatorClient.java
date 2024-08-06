import java.util.Scanner;

/* AccumulatorClient
 * Driver class for ArrayListAccumulator
 * MCS 141
 * 11/27/18
 * */

public class ArrayListAccumulatorClient {
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    ArrayListAccumulator acc = new ArrayListAccumulator();
    
    int low;
    int high;
    int count;
    
    System.out.println("Enter minimum value:");
    low = scan.nextInt();
    System.out.println("Enter maximum value:");
    high = scan.nextInt();
    System.out.println("Provide number of entries:");
    count = scan.nextInt();
    
    System.out.println("Entering values...");
    for (int i = 0; i < count; i++) {
      int rand = (int)((high - low + 1)*Math.random() + low);
      System.out.print(rand);
      acc.add(rand);
      if (i < count - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("\n");
    System.out.println("Values entered: " + acc.listValues() );
    System.out.println("Maximum is: " + acc.getMax() );
    System.out.println("Minimum is: " + acc.getMin() );
    System.out.println("Total is: " + acc.getTotal() );
    System.out.println("Average is " + acc.getAverage() );
  }
}