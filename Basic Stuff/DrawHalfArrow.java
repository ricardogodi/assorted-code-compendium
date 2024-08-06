import java.util.Scanner;  

public class DrawHalfArrow { 
  public static void main(String[] args) { 
    Scanner scnr = new Scanner(System.in); 
    int arrowBaseHeight = 0; 
    int arrowBaseWidth  = 0; 
    int arrowHeadWidth = 0; 
    
    System.out.println("Enter arrow base height:"); 
    arrowBaseHeight = scnr.nextInt(); 
    
    System.out.println("Enter arrow base width:"); 
    arrowBaseWidth = scnr.nextInt(); 
    
    System.out.println("Enter arrow head width:"); 
    arrowHeadWidth = scnr.nextInt(); 
    //System.out.println();
    
    while (arrowHeadWidth <= arrowBaseWidth) {
      
      System.out.println("Enter arrow head width:"); 
      arrowHeadWidth = scnr.nextInt(); 
    }
    System.out.println();
    
    for (int i = 1; i <= arrowBaseHeight; i++) {
      for (int n = 1; n <= arrowBaseWidth; n++ ) {
        System.out.print("*"); 
      } 
      System.out.println();
    }
    
    for (int i = arrowHeadWidth; i >= 1; i--) {
      for (int n = 1; n <= i; n++ ) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    return; 
  } 
}