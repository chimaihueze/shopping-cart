package models;

public class Item {
    private String name;
    private double price;
    
// constructor
public Item(String name, double price) {
    this.name = name;
    this.price = price;
}

// copy constructor
public Item(Item source) {
    this.name = source.name;
    this.price = source.price;
}
  
}
