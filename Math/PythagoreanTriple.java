public class PythagoreanTriple {
  
  public static void main(String [] args) {
    double aSqrd = 0;
    double bSqrd = 0;
    double cSqrd = 0;
    double a = 0;   
    double b = 0;
    double c = 0;
    
    for (int j = 1; j <= 1000; j++) {
        cSqrd = j;
        aSqrd = 1;
        bSqrd = (cSqrd-1);
        c = Math.sqrt(cSqrd);
    
      for (int i = 1; aSqrd < bSqrd; i++) {
        
        aSqrd = i;
        bSqrd = (cSqrd-i);
    
        a = Math.sqrt(aSqrd);
        b = Math.sqrt(bSqrd);
        
        if ( ( a == (int) a) &&  ( b == (int) b) &&  ( c == (int) c)) {
          System.out.println("("+(int)a+","+(int)b+","+(int)c+")");
          // System.out.println(aSqrd bSqrd = cSqrd
        }
         if ( a + b + c == 100000) {
           //System.out.println("("+(int)a+","+(int)b+","+(int)c+")");
         System.out.println("BINGO");
        }
      }      
    }
  }
}