package models;

import java.util.ArrayList;
public class Cart {
    ArrayList<Item> items;

    // constructor
    public Cart() {
        this.items = new ArrayList<Item>();
    }

    // getter
    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    // setter
    public void setItems(int index, Item item) {
        this.items.set(index, new Item(item));
    }


    /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */

 
 
  
   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */

 
 
  
   /**
    *  Name: checkout
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    */
    
}
