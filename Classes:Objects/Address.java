/** @author Ricardo Gonzalez
  * @since 02/07/19
  * */
 

public class Address {
  
  //data fields
  private String st;   
  private String cty;
  private String state;
  private String phoneNo;
  private String zpCde;
  
  public Address() {
    st = "";
    cty = "";
    state = "";
    phoneNo = "";
    zpCde = "";
  } //end default constructor
  
  public Address(String st, String cty, String state, String phoneNo, String zpCde) {
    setStreet(st);
    setCity(cty);
    setState(state);
    setPhoneNumber(phoneNo);
    setZipCode(zpCde);
  } //end constructor
  
  
  //getters
  public String getStreet() {
    return st;
  }
  
  public String getCity() {
    return cty;
  }
  
  public String getState() {
    return state;
  }
  
  public String getPhoneNumber() {
    return phoneNo;
  }
  
  public String getZipCode() {
    return zpCde;
  }
  
  //setters
  public void setStreet(String st) {
    this.st = st;
  }
  
  public void setCity(String cty) {
    this.cty = cty;
  }
  
  public void setState(String state ) {
    this.state = state;
  }
  
  public void setPhoneNumber(String phoneNo) {
    this.phoneNo = phoneNo;
  }
  
  public void setZipCode(String zpCde) {
    this.zpCde = zpCde;
  }
  
  //toString
  public String toString() {
    return String.format("Street: %s\nCity: %s\nState: %s\nPhone Number: %s\nZip Code: %s\n", st, cty, state, phoneNo, zpCde);
  }
}