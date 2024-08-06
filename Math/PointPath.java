import java.util.Scanner;
 
/* PointPath class
 * Allows user to enter a path of (x,y) points and calculates the total
 * distance.
 * MCS 141
 * 10/18/18
 * */
 
public class PointPath {

  public static void main(String [] args) {
    // set up necessary variables and get data
    Scanner scan = new Scanner(System.in);
    int n; // number of data points
    double [] xValues;
    double [] yValues;
    char selection; // stores menu selection
     
    System.out.println("How many data points will you enter?");
    n = scan.nextInt();
     
    xValues = new double[n];
    yValues = new double[n];
     
    // read data in
    for (int i = 0; i < n ; i++) {
      System.out.print("Enter x value #" + (i+1) + ": ");
      xValues[i] = scan.nextDouble();
      System.out.print("Enter y value #" + (i+1) + ": ");
      yValues[i] = scan.nextDouble();
    }
    scan.nextLine(); // clear input stream
     
    // application loop
    do {
      selection = menu(scan);
      //System.out.println("You chose " + selection);
      //using "switch"
      switch (selection) {
        case 'c':
          System.out.println("Total distance is: " + totalDistance(xValues,yValues));
          break;
        case 'd':
          displayData( xValues, yValues);
          break;
        case 'e':
          editData( xValues, yValues, scan);
          break;
          //default:
          // runs if no other case has executed
      } // end switch
       
    } while (selection != 'q');
     
    System.out.println("Goodbye");
  } // end of main
   



  /* Menu method */
  public static char menu(Scanner scan) {
    char choice;
    System.out.println("Enter a selection:");
    System.out.println("c. Calculate distance");
    System.out.println("d. Display data");
    System.out.println("e. Edit data");
    System.out.println("q. Quit");
    String input = scan.nextLine();
    input = input.toLowerCase();
    choice = input.charAt(0);
    return choice;
  } // end menu
   





  // display data method
  public static void displayData(double [] x, double [] y) {
    for (int i = 0; i < x.length ; i++) {
      System.out.printf("Point %d: ( %f, %f )%n", (i+1), x[i], y[i]);
    }
  } // end display method
   














  // edit data method
  public static void editData(double [] x, double [] y, Scanner scan) {
    displayData(x, y);
    System.out.println("Which point should be replaced? (Enter line number)");
    int line = scan.nextInt(); // opportunity for data validation
     
    System.out.print("Enter new x: ");
    x[ line - 1 ] = scan.nextDouble();
    System.out.print("Enter new y: ");
    y[ line - 1 ] = scan.nextDouble();
    scan.nextLine(); // scanner bug
  } // end edit method
   



  // distance between two points
  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow( y2 - y1, 2));
  }
   



  // sum of all distances
  public static double totalDistance(double [] x, double [] y) {
    double total = 0.0;
    for (int i = 0; i < x.length - 1 ; i++) {
      double nextDistance = distance( x[i] , y[i], x[i+1], y[i+1] );
      total = total + nextDistance;
    }
    return total;
  }
   
} // end of class