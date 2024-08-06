public class PythagoreanTriple2 {
  
  public static void main(String [] args) {
    int a; 
    int b;
    int c;
    int aSquared; 
    int bSquared;
    int cSquared;
    
    int i;
    int n = 1;
    for (int j = 1; j <= 100000/3; j++) {
      a = j;
      
      i = 1;
      do {
        
        b = j+i;
        c = 100000-(a+b);
        
        // System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
        aSquared = (int) Math.pow(a,2);
        bSquared = (int) Math.pow(b,2);
        cSquared = (int) Math.pow(c,2);
        
        if ((aSquared + bSquared) == cSquared) {
          
          System.out.println(n + ". " + "The Pythagorean triple (" + a + "," + b + "," + c + ") " 
                               + "is an ordered triple such that a + b + c = 100000");
          System.out.println("a = " + a);
          System.out.println("b = " + b);
          System.out.println("c = " + c);
          System.out.println("Check: " + a + " + " + b + " + " + c + " = " + (a+b+c));
          System.out.println();
          
          System.out.println("a^2 = " + aSquared);
          System.out.println("b^2 = " + bSquared);
          System.out.println("c^2 = " + cSquared);
          System.out.println("Check: " + aSquared + " + " + bSquared + " = " + cSquared);
          System.out.println();
          n++;
        }
        
        i++;
      } while ((b + 2 < c));
    }  
  }
}
