import java.util.*;
import java.lang.Math;

public class SecondsToMinutesAndSeconds{
  private static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {
    int totalSeconds, seconds, minutes;
    System.out.println("Enter a number of seconds");
    totalSeconds = input.nextInt();
    minutes = totalSeconds / 60;
    seconds = totalSeconds % 60;
    System.out.println(Integer.toString(totalSeconds) + " seconds is " + minutes 
                         + " minutes and " + seconds + " seconds.");
  }
}
