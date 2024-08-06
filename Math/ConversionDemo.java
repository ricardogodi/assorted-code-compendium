 /* Conversion and I/ O demo
 * MCS 141
 * 08/28/18
 * Converts seconds to hours, minutes, seconds
 * */

import java.util.Scanner ;
public class ConversionDemo {
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    int seconds;
    int minutes;
    int hours;
    
    //take input
    System.out.println("Enter a number of seconds:");
    seconds = scan.nextInt() ;
      
    //Calculations
    hours = seconds/3600; // 60*60 = 3600 seconds per hour
    seconds = seconds%3600;     //Get a remainder. How many are left!? Reusing the location
    minutes = seconds/60;     //calculate minutes from remaining seconds
    seconds = seconds%60;
    
    //output
    System.out.println("That is " + hours + " hour(s), " + minutes
                        + "minute(s) and " + seconds + " second(s). ");
    //alternate output
   System.out.printf("That is %d hour(s), %d minute(s) and %d second(s) . %n",
    hours, minutes, seconds);
  }
}