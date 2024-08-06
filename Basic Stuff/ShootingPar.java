import java.util.Scanner;

public class ShootingPar {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int score;
    
    System.out.println("Enter a score:");
    score = scan.nextInt();
    
    if (score==72) {
      System.out.println("Par");
    } else if (score<72) {
      System.out.println("Under Par");
    }
    else {
      System.out.println("Over Par");
    }
  }
}
