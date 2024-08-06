public class BasicTVClient {
  
  public static void main(String [] args) {
    System.out.println("Create a new BasicTV object:");
    BasicTV b = new BasicTV();
    System.out.println(b);
    System.out.println("Call power() to turn TV on:");
    b.power();
    System.out.println(b);
    System.out.println("Increase channel 10 times:");
    for (int i = 0; i < 10; i++) {
      b.channelUp();
    }
    System.out.println(b);
    System.out.println("Decrease channel 20 times:");
    for (int i = 0; i < 20; i++) {
      b.channelDown();
    }
    System.out.println(b);
    System.out.println("Attempt to set channel to 1000:");
    b.setChannel(1000);
    System.out.println(b);
    System.out.println("Attempt to set channel to 50:");
    b.setChannel(50);
    System.out.println(b);
    System.out.println("Call previousChannel():");
    b.previousChannel();
    System.out.println(b);
    System.out.println("Call previousChannel():");
    b.previousChannel();
    System.out.println(b);
  }
}