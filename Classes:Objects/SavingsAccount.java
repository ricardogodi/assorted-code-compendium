package application; 
/* SavingsAccount class 
 Anderson, Franceschi 
 */ 

// 1. ***** indicate that SavingsAccount inherits 
//          from BankAccount 
public class SavingsAccount extends BankAccount { 
  public final double DEFAULT_RATE = .03; 
  // 2. ****** define the private interestRate instance variable 
  // interestRate, a double, represents an annual rate 
  private double interestRate; 
  // 3 ***** write the default constructor 
  /** default constructor 
    *   explicitly calls the BankAccount default constructor 
    *   set interestRate to default value DEFAULT_RATE 
    *   print a message to System.out indicating that 
    *    constructor is called 
    */ 
  public SavingsAccount() { 
    super(); 
    interestRate = DEFAULT_RATE; 
  } 
  // 4 ***** write the overloaded constructor 
  /** overloaded constructor 
    *   explicitly call BankAccount overloaded constructor 
    *   call setInterestRate method, passing startInterestRate 
    *   print a message to System.out indicating that 
    *    constructor is called 
    *  @param  startBalance      starting balance 
    *  @param  startInterestRate starting interest rate 
    */ 
  public SavingsAccount(double startBalance, double startInterestRate) { 
    super(startBalance); 
    setInterestRate( startInterestRate ); 
  } 
  // 5 ****** write this method: 
  /** applyInterest method, no parameters, void return value 
    *  call deposit method, passing a month's worth of interest 
    *  remember that interestRate instance variable is annual rate 
    */ 
  public void applyInterest() { 
    deposit( getBalance()*interestRate/12.0 ); 
  } 
  
  /** accessor method for interestRate 
    *  @return  interestRate 
    */ 
  public double getInterestRate( ) { 
    return interestRate; 
  } 
  




  /** mutator method for interestRate 
    *  @param  newInterestRate new value for interestRate 
    *          newInterestRate must be >= 0.0 
    *            if not, print an error message 
    */ 
  public void setInterestRate( double newInterestRate ) { 
    if ( newInterestRate >= 0.0 ) 
      interestRate = newInterestRate; 
    else 
      System.err.println( "Interest rate cannot be negative" ); 
  } 
  
  // 6 *****  write this method 
  /* toString method 
   *  @return String containing formatted balance and interestRate 
   *    invokes superclass toString to format balance 
   *    formats interestRate as percent using String.format() 
   */ 
  public String toString() { 
    return super.toString() + String.format("%ninterest rate: %.1d%%", interestRate*100); 
  } 
  
  
} 
