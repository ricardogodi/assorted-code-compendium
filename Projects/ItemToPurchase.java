/* Ricardo Gonzalez
 * MCS 141 
 * Professor: Jonathan Sprague
 * 11/25/18
 * Item Class Definition
 * */

public class ItemToPurchase {
  
  private String itemName;
  private int itemPrice;
  private int itemQuantity;
  private String itemDescription;
  
  public ItemToPurchase() {
    itemName = "none";
    itemPrice = 0;
    itemQuantity = 0;
    itemDescription = "none";
  }
  
  public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
    this.itemName = itemName;
    this.itemDescription = itemDescription;
    this.itemPrice = itemPrice;
    this.itemQuantity = itemQuantity;
  }
  
  public String getName() {
    return itemName;
  }
  
  public int getPrice() {
    return itemPrice;
  }
  
  public int getQuantity() {
    return itemQuantity;
  }
  
  public String getDescription() {
    return itemDescription;
  }
  
  public void setName(String name) {
    itemName = name;
  }
  
  public void setDescription(String name) {
    itemDescription = name;
  }
  
  public void setPrice(int price) {
    itemPrice = price;
  }
  
  public void setQuantity(int quantity) {
    itemQuantity = quantity;
  }
  
  public void printItemCost() {
    System.out.printf("%s %d @ $%d = $%d%n", itemName, itemQuantity, itemPrice, itemQuantity*itemPrice); 
  }
  
  public void printItemDescription() {
     System.out.printf("%s: %s%n", itemName, itemDescription);
  }
  
  public String toString() {
    return String.format("%s %d @ $%d = $%d", itemName, itemQuantity, itemPrice, itemQuantity*itemPrice);
  }
}