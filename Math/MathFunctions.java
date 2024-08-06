import java.util.Scanner;

public class MathPractice {
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     
     
     System.out.println("Enter a positive integer:");
     int posInt = scan.nextInt();
     
     
     
    
     
     System.out.println("You entered " + posInt);
     
     double numSquared = Math.pow(posInt, 2.0);           
     System.out.printf("The number squared is %.1f\n", numSquared);
     
     double numSqrt = Math.sqrt(posInt);
     System.out.println("The square root of the number is " +  numSqrt);
     
     System.out.printf("Rounded to two decimal places, that is %.2f\n", numSqrt);
     
     double numNatLog = Math.log(posInt);
     System.out.printf("The natural log of %d, rounded to three decimal places, is %.3f\n", posInt, numNatLog);
     
     double numCmnLog = Math.log10(posInt);
     System.out.printf("The common log of %d, rounded to three decimal places, is %.3f\n", posInt, numCmnLog);
     
     double numSin = Math.sin(Math.toRadians(posInt));
     System.out.printf("If %d is an angle in degrees, the sine of %d, rounded to four decimal"
                         +" places, is %.4f\n", posInt, posInt, numSin);
   }
   
}

