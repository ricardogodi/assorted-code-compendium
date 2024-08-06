import java.util.Random;
import java.util.Scanner;

public class TraverseCount {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many scores do you want to generate?");
    
    int[] scores = randomArray(scan.nextInt());
    int a = inRange(scores, 90, 100);
    int b = inRange(scores, 80, 90); 
    int c = inRange(scores, 70, 80);
    int d = inRange(scores, 60, 70);
    int f = inRange(scores, 0, 60);
    
    System.out.println();
    System.out.println("Scores between 90 - 100: " + a);
    System.out.println("Scores between 80 - 90: " + b);
    System.out.println("Scores between 70 - 80: " + c);
    System.out.println("Scores between 60 - 70: " + d);
    System.out.println("Scores between 0 - 60: " + f);
   
    
    
    int[] counts = new int[100];
    for (int i = 0; i < scores.length; i++) {
      int index = scores[i];
      System.out.println(index);
      counts[index]++;
    }
    
    
    
  }
  
  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    
    for (int i = 0; i < size; i++) {
      System.out.println(a[i]);
    }
    return a; 
  }
  
  public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] >= low && a[i] < high) {
        count++; 
      } 
    }
    return count;
  }
}









