  public static int positiveDiff(int number1, int number2) {
     int difference = Math.abs(number1 - number2);
     return difference;
  }
  
  public static double hypotenuse(double firstLeg, double secondLeg) {
     double hypotenuse = Math.sqrt((firstLeg*firstLeg)+(secondLeg*secondLeg));
     return hypotenuse;
  }
  
  public static double nthRoot (double number1, int number2) {
     double nthRoot = (Math.pow(number1, 1.0/number2));
     return nthRoot;
  }   
  
  
  public static int sum( int number1, int number2 ) {
    int sum = number1 + number2;
    return sum;
  }
  
  public static double average( int number1, int number2, int number3 ) {
    double average = (number1 + number2 + number3)/3.0;
    return average;
  }
  
  public static int biggest( int number1, int number2 ) {
    if (number1 < number2) {
      return number2;
    } else {
      return number1;
    }
  }


public static void evenOrOdd(int number) {
    if (number % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }       
  }
  
  public static void posOrNeg(int number) {
    if (number == 0) {
      System.out.println("zero");
    } else if (number > 0) {
      System.out.println("positive");
    } else {
      System.out.println("negative");
    }
  }
  
  public static void greater(int number1, int number2) {
    if (number1 > number2) {
      System.out.printf("%d is greater than %d\n", number1, number2);
    } else if (number1 == number2) {
      System.out.printf("%d is equal to %d\n", number1, number2);
    } else {
      System.out.printf("%d is greater than %d\n", number2, number1);
    } 
  }