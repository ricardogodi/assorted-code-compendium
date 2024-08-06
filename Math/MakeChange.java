/** Ricardo Gonzalez Diaz
  * MCS 141
  * Professor: Jonathan Sprague
  * My program converts number of cents, to the minimum number
  * of coins, how many and what type of them it
  * is required to have such number of cents. 
  */

import java.util.Scanner;                                    //Import Scanner.

public class MakeChange {                                    //Create Class.
  
  public static void main(String [] args) {                  //Use main Method.
    Scanner in = new Scanner(System.in);                     //Create Scanner
    
    int quarters, dimes, nickels, pennies, cents, coins;     //Declare Variables
    final int centsPerQuarter = 25;
    final int centsPerDime = 10;
    final int centsPerNickel = 5;
    
    System.out.println("Input a number of cents:");          //Prompt the User.
    cents = in.nextInt();                                    //Store input.
    
    quarters = cents/centsPerQuarter;                                     //Calculations.
    dimes = (cents%centsPerQuarter)/centsPerDime;
    nickels = ((cents%centsPerQuarter)%centsPerDime)/centsPerNickel;
    pennies = ((cents%centsPerQuarter)%centsPerDime)%centsPerNickel;
    coins = quarters + dimes + nickels + pennies;
    
    System.out.printf("%s cents can be made with %s coins:%n", cents, coins);   //Output.
    
    System.out.printf("Quarters: %s%n", quarters);
    System.out.printf("Dimes: %s%n", dimes);
    System.out.printf("Nickels: %s%n", nickels);
    System.out.printf("Pennies: %s%n", pennies);  
  }   
}