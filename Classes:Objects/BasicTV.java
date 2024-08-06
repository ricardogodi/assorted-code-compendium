/************************************************
  * BasicTV Class<BR>
  * Used in <B>MCS 141</B> to demonstrate class
  * design and Javadoc.
  * @author Jonathan Sprague
  * @version 11/8/18
  * *********************************************/

public class BasicTV {
  // instance variables
  private int currentChannel;
  private int previousChannel;
  private boolean currentPower;
  
  /**
   * Default constructor.  Initializes currentChannel and
   * previousChannel to 3 and currentPower to false.
   * */
  public BasicTV() {
    currentChannel = 3;
    previousChannel = 3;
    currentPower = false;
  }
  
  /**
   * Accessor method.  Returns the current channel.
   * @return the current channel
   * */
  public int getChannel() {
    return currentChannel;
  }
  
  /**
   * Accessor method.  Returns current power state.
   * @return true if the TV is on, false otherwise
   * */
  public boolean getPower() {
    return currentPower;
  }
  
  /**
   * Sets the current channel.  If the parameter is not between 1 and 100 (inclusive),
   * this method leaves the current channel unchanged.
   * @param channel an integer to set the channel to
   * */
  public void setChannel( int channel ) {
    if ( currentPower == true && channel >= 1 && channel <= 100) {
      previousChannel = currentChannel;
      currentChannel = channel;
    }
  }
  
  /**
   * Switch power from on to off or vice versa.
   * */
  public void power() {
    currentPower = !currentPower;
  }
  
  
  
  
  
  
  
  
  /**
   * Increases the current channel by 1.  If the channel exceeds
   * 100, resets the channel to 1.
   * */
  public void channelUp() {
    if (currentPower == true) {
      previousChannel = currentChannel;
      currentChannel++;
    }
    if (currentChannel > 100) {
      currentChannel = 1;
    }
  }
  
  /**
   * Decreases the current channel by 1.  If the channel goes below
   * 1, resets the channel to 100.
   * */
  public void channelDown() {
    if (currentPower == true) {
      previousChannel = currentChannel;
      currentChannel--;
    }
    if (currentChannel < 1) {
      currentChannel = 100;
    }
  }
  
  /**
   * Sets the current channel to the previous channel.  Swaps the values of
   * currentChannel and previousChannel.
   * */
  public void previousChannel() {
    setChannel( previousChannel );
  }
  
  @Override
  public String toString() {
    if (currentPower == true) {
      return String.format("BasicTV is on. Channel is %d.", currentChannel);
    }
    else {
      return "BasicTV is off.";
    }
  }
}