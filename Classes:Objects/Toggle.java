public class Toggle {
  
  private boolean toggle;
  
  public Toggle() {
    this.toggle = false;
  }
  
  public void press() {
   this.toggle = !this.toggle; 
  }
  
  public boolean getState() {
    return this.toggle;
  }
}