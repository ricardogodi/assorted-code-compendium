/**
 A class that represents a student.
 
 @author Ricardo Gonzalez
 @since 02/07/19
 */

public class Student
{
  private Name   fullName;
  private String id;   // Identification number
  private Address address;
  
  public Student()
  {
    this.fullName = new Name();
    this.id = "";
    this.address = new Address();
  } // end default constructor
  
  public Student(Name studentName, String studentId, Address studentAddress)
  {
    fullName = studentName;
    id = studentId;
    address = studentAddress;
  } // end constructor
  
  public void setStudent(Name studentName, String studentId, Address address)
  {
    setName(studentName); // Or fullName = studentName;
    setId(studentId);     // Or id = studentId;
    setAddress(address);
  } // end setStudent
  
  public void setName(Name studentName)
  {
    fullName = studentName;
  } // end setName
  
  public Name getName()
  {
    return fullName;
  } // end getName
  
  public void setId(String studentId)
  {
    id = studentId;
  } // end setId
  
  public String getId()
  {
    return id;
  } // end getId
  
   public Address getAddress() {
    return address; 
  } //end getAddress
  
  public void setAddress(Address address) {
    this.address = address;
  } //end setAddress
  
  
  public String toString()
  {
    return "Name: " + fullName.toString() + "\n" + "id: " + id + "\n" + address.toString();
  } // end toString
  
  public static void main(String [] args) {
    Name fullName = new Name("Mr.","Reed");
    Address address = new Address("19351 W Washington St.", "Grayslake", "Illinois", "?", "?"); 
    Student st = new Student(fullName, "00001", address);
    
    System.out.println(st);
  }
  
}  // end Student