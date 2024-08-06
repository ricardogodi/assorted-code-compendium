/* Ricardo Gonzalez
 * MCS 141 
 * Professor: Jonathan Sprague
 * 11/25/18
 * Shopping Cart Class Definition
 * */

import java.util.ArrayList;

public class ShoppingCart {
  
  private String customerName;
  private String currentDate;
  private ArrayList<ItemToPurchase> cartItems;
  private static int count = 0;
  
  public ShoppingCart() {
    customerName = "none";
    currentDate = "January 1, 2016";
    cartItems = new ArrayList<ItemToPurchase>();
  }

  public ShoppingCart(String customerName, String currentDate) {
    this.customerName = customerName;
    this.currentDate = currentDate;
    cartItems = new ArrayList<ItemToPurchase>();
  }
  
  public String getCustomerName() {
    return customerName; 
  }
  
  public String getDate() {
    return currentDate; 
  }
  
  public void addItem(ItemToPurchase newItem) {
    cartItems.add(newItem);
    count++;
  }
  
  public void removeItem(String itemName) {
    boolean flag = false;
    for (int i = 0; i < cartItems.size(); i++) {
      
      if (itemName.compareTo(cartItems.get(i).getName()) == 0) {
        cartItems.remove(i);
        flag = true;
        break;
      } 
    }
    if (!flag) {
      System.out.println("Item not found in cart. Nothing removed.");
    }
  }
  
  
  
  
  
  public void modifyItem(ItemToPurchase item) {
    boolean flag = false;
    for (int i = 0; i < cartItems.size(); i++) {
      if (item.getName().compareTo(cartItems.get(i).getName()) == 0) {
        cartItems.get(i).setQuantity(item.getQuantity());
        flag = true;
        break;
      }
    }
    if (!flag) {
      System.out.println("Item not found in cart. Nothing modified.");
    }
  }
  
  public int getNumItemsInCart() {
    int itemSum = 0;
    for (int i = 0; i < cartItems.size(); i++) {
      itemSum = itemSum + cartItems.get(i).getQuantity();
    }
    return itemSum;
  }
  
  public int getCostOfCart() {
    int total = 0;
    for (int i = 0; i < cartItems.size(); i++) {
      total = total + cartItems.get(i).getPrice()*cartItems.get(i).getQuantity();
    }
    return total;
  }
  
  public void printTotal() {
    System.out.printf("%s's Shopping Cart - %s%n", customerName, currentDate);
    System.out.println("Number of Items: " + getNumItemsInCart());
    System.out.println();
    if (getNumItemsInCart() == 0) {
      System.out.println("SHOPPING CART IS EMPTY");
    }
    for (int i = 0; i < cartItems.size(); i++) {
      if (cartItems.get(i).getQuantity() > 0) { 
        cartItems.get(i).printItemCost();
      }
    }
    System.out.println();
    System.out.printf("Total: $%d%n", getCostOfCart());
  }
  
  public void printDescriptions() {
    System.out.printf("%s's Shopping Cart - %s%n", customerName, currentDate);
    System.out.println();
    System.out.printf("Item Descriptions%n");
    for (int i = 0; i < cartItems.size(); i++) {
      if (cartItems.get(i).getQuantity() > 0) { 
        cartItems.get(i).printItemDescription();
      }
    }
  }
}