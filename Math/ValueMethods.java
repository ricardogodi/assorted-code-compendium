// imports must go here!

/**
 * Value Methods Practice<br>
 * <b>MCS 141</b><br>
 * Value method examples and practice
 * using Javadoc.
 * @author Jonathan Sprague
 * @version 9/20/18
 * */

public class ValueMethods {
  
  /* Method for testing */
  public static void main( String [] args) {
    System.out.println("The reciprocal of 3 is " + reciprocal(3));
    System.out.println("The reciprocal of 2.5 is " + reciprocal(2.5));
    System.out.println("The reciprocal of .1 is " + reciprocal(0.1));
    System.out.println("The min of 3 and 10 is " + min(3,10) );
    System.out.println("The min of 5 and -2 is " + min(5,-2) );
    System.out.println("The min of 1 and 1 is " + min(1,1) );
  }
  
  /**
   * Method to calculate the reciprocal of a number
   * @param number the number to take the reciprocal of
   * @return the reciprocal of the number as a double
   * */
  public static double reciprocal(int number) {
    //System.out.println("accepted value as an int");
    double recip = 1.0/number;
    return recip;
  }
  
  /**
   * Overloaded method to calculate the reciprocal of a number
   * (Note it would probably be better to <b>just</b> have this
   * version without the int version)
   * @param number the number to take the reciprocal of
   * @return the reciprocal of the number as a double
   * */
  public static double reciprocal(double number) {
    //System.out.println("accepted value as a double");
    return 1/number;
  }
  
  /**
   * Method to calculate the minimum of two ints
   * @param a the first integer
   * @param b the second integer
   * @return the minimum of a and b
   * */
  public static int min(int a, int b) {
    if ( a < b ) {
      return a;
    }
    else {
      return b;
    }
  }
  
  /**
   * Method to calculate the minimum of three ints
   * @param a the first integer
   * @param b the second integer
   * @param c the third integer
   * @return the minimum of a, b, and c
   * */
  public static int min(int a, int b, int c) {
    int temp = min(a, b);
    int temp2 = min(temp, c);
    return temp2;
  }
  
  /**
   * Method to calculate the minimum of four ints
   * @param a the first integer
   * @param b the second integer
   * @param c the third integer
   * @param d the fourth integer
   * @return the minimum of a, b, c, and d
   * */
  public static int min(int a, int b, int c, int d) {
    //return min( min(a,b,c) , d);
    //return min(min(min(a,b),c),d);
    return min( min(a,b) , min(c,d) );
  }
  
    /** Tests if the first parameter is between the other two (inclusive).
    * @param a the number to be tested
    * @param b the lower bound
    * @param c the upper bound
    * @return true if a is between b and c (inclusive), false otherwise
    * */
  public static boolean isBetween(int a, int b, int c) {
    if ( b <= a && a <= c ) {
      return true;
    }
    else {
      return false;
    }
    // could have done:
    // return b <= a && a <= c ;
  }

  /** Determines if the year entered is a leap year.
    * @param year the Gregorian calendar year as an int (ex. 2017)
    * @return true if the year is a leap year, false otherwise.
    * */
  public static boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    else if (year % 100 == 0) {
      return false;
    }
    else if (year % 4 == 0) {
      return true;
    }
    else {
      return false;
    }
  }
}
