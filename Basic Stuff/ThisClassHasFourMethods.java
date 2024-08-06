import java.util.Scanner;

public class ThisClassHasFourMethods {
  
  public static void sayHi() {
    System.out.println("Hello!");
  }
  
  public static void smallTalk(String name) {   //Asigna variable NAME a parametro name
    
    System.out.printf("How are you, %s?\n", name);            
  }
  
  public static void sayBye() {
    System.out.println("Have a good day!");
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    sayHi();     //Ejecuta el method sayHi y lo que hay ahi dentro de el.
    
    System.out.println("What is your name?");
    
    String NAME = scan.nextLine();   //Crea variable con nombre NAME y PIDE INPUT. PROVIDES ARGUMENT. 
    
    smallTalk(NAME);   //Ejecuta method smallTalk que contiene el ARGUMENTO NAME, que sera asignado a parametro name
    
    sayBye();
  }
}
