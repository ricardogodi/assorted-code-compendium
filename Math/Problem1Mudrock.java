//Author: RICARDO GONZALEZ 
//DISCRETE MATH Extra Credit
//PROFESSOR: JEFFREY MUDROCK

public class Problem1 {
  
  public static void main (String [] args) {
    
    int counter = 0;
    int max = 0;
    int number = 0;
    int n;
    
    for (int i = 1; i < 100000; i++) {
      n = i;
      counter = 1;
      //System.out.print(n + " ");
      do {
        if (n == 1) {
          break;
        } else  if ((n%2)==0) {
          n = n/2;
          //System.out.print(n + " ");
        } else {
          n = (3*n)+1; 
          // System.out.print(n + " ");
        }
        counter++;
      } while (n != 1);
      //System.out.print("Length: " + counter);
      //System.out.println();
      if (counter > max) {
        max = counter;
        number = i;
      }
    }
    System.out.println("Max number of elements in the sequence: " + max + " For the number: " + number);
  }
}

Max number of elements in the sequence: 351 For the number: 77031