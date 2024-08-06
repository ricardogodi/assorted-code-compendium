/* Ricardo Gonzalez
 * MCS 141 
 * Professor: Jonathan Sprague
 * 11/25/18
 * Shopping Cart Project Manager
 * */

import java.util.Scanner;

public class ShoppingCartManager {
  
  public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    String customerName;
    String date;
    char choice;
    
    System.out.println("Enter Customer's Name:");
    customerName = scan.nextLine();
    System.out.println("Enter Today's Date:");
    date = scan.nextLine();
    
    ShoppingCart cart = new ShoppingCart(customerName, date);
    System.out.println("Customer Name: " + cart.getCustomerName());
    System.out.println("Today's Date: " + cart.getDate());
    
    do {
      printMenu(scan, cart);
      choice = selection(scan, "Choose an option:");
      if (choice == 'a' ) {
        addItem(scan, cart);
      }
      if (choice == 'd' ) {
        removeItem(scan, cart);
      }
      if (choice == 'c' ){
        changeItem(scan, cart);
      }
      if (choice == 'i' ){
        outputDescriptions(scan, cart);
      }
      if (choice == 'o' ){
        outputCart(scan, cart);
      }
    } while (choice != 'q'); 
  }

  public static void printMenu(Scanner scan, ShoppingCart cart) {
    System.out.println("MENU");
    System.out.println("a - Add item to cart");
    System.out.println("d - Remove item from cart");
    System.out.println("c - Change item quantity");
    System.out.println("i - Output items' descriptions");
    System.out.println("o - Output shopping cart");
    System.out.println("q - Quit");
    System.out.println();
  }
  



  public static void addItem(Scanner scan, ShoppingCart cart) {
    String itemName;
    String itemDescription;
    int itemPrice;
    int itemQuantity;
    
    System.out.println("ADD ITEM TO CART");
    System.out.println("Enter the item name:");
    itemName = scan.nextLine();
    System.out.println("Enter the item description:");
    itemDescription = scan.nextLine();
    System.out.println("Enter the item price:");
    itemPrice = scan.nextInt();
    System.out.println("Enter the item quantity:");
    itemQuantity = scan.nextInt();
    scan.nextLine();
    
    ItemToPurchase newItem = new ItemToPurchase(itemName, itemDescription, 
                                                itemPrice, itemQuantity);
    cart.addItem(newItem);
  }
  
  public static void removeItem(Scanner scan, ShoppingCart cart) {
    String itemName;
    System.out.println("REMOVE ITEM FROM CART");
    System.out.println("Enter name of item to remove:");
    itemName = scan.nextLine();
    cart.removeItem(itemName);
  }
  
  public static void changeItem(Scanner scan, ShoppingCart cart) {
    String itemName;
    int newQuantity;
    
    System.out.println("CHANGE ITEM QUANTITY");
    System.out.println("Enter the item name:");
    itemName = scan.nextLine();
    System.out.println("Enter the new quantity:");
    newQuantity = scan.nextInt();
    scan.nextLine();
    ItemToPurchase newItem = new ItemToPurchase();
    newItem.setName(itemName);
    newItem.setQuantity(newQuantity);
    cart.modifyItem(newItem);
  }
  
  public static void outputDescriptions(Scanner scan, ShoppingCart cart) {
    System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
    cart.printDescriptions();
  }
  
  public static void outputCart(Scanner scan, ShoppingCart cart) {
    System.out.println("OUTPUT SHOPPING CART");
    cart.printTotal();
  }
  





  public static char selection(Scanner scan, String prompt) {
    char choice; 
    do {
      System.out.println(prompt);
      String input = scan.nextLine();
      input = input.toLowerCase();
      choice = input.charAt(0);
    } while(choice != 'a' && choice != 'd' && choice != 'c' 
           && choice != 'i'&& choice != 'o' && choice != 'q'); 
    return choice;
  }
}