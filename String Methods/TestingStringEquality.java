public class TestingStringEquality {
  
  public static void main(String [] args) {
    String a = "Hello";
    String b = "Hello";
    String c = new String("Hello");
    String d = new String("Hello");
    
    System.out.println("a is " + a);
    System.out.println("b is " + b);
    System.out.println("c is " + c);
    System.out.println("d is " + d);
    
    System.out.println("a == b is " + (a == b) );
    System.out.println("a == c is " + (a == c) );
    System.out.println("c == d is " + (c == d) );
    
    // moral of the story:  Use .equals() to compare Strings
    
    System.out.println("a.equals(b) is " + a.equals(b));
    System.out.println("a.equals(c) is " + a.equals(c));
    System.out.println("c.equals(d) is " + c.equals(d));
    
  }
}