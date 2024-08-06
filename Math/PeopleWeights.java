import java.util.Scanner;

public class PeopleWeights {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double [] weights = new double[5];
    double totalWeight = 0;
    double averageWeight = 0;
    double maxWeight = 0;
    int i = 0;
    
    for (i = 0; i < weights.length; i++) {
      System.out.println("Enter weight " + (i+1));
      weights[i] = scan.nextDouble();
      totalWeight = totalWeight + weights[i];
    }
    averageWeight = totalWeight/i;
    
    System.out.print("You entered: ");
    for (int n = 0; n < weights.length; n++) {
    System.out.print(weights[n] + " ");
    }
    System.out.println();
    
    for (i = 0;  i < weights.length; i++) {
      if (maxWeight < weights[i]) {
      maxWeight = weights[i];
      }
    }
    
    System.out.println("Total weight: " + totalWeight);
    System.out.println("Average weight: " + averageWeight);
    System.out.println("Max weight: " + maxWeight);
    return;
  }
}