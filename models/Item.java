package models;

public class Item {
    private String name;
    private double price;
    
// constructor
public Item(String name, double price) {

    if (name.isBlank() || name == null) {
        throw new IllegalArgumentException("Name cannot be null/blank");
    }
    if (price < 0) {
        throw new IllegalArgumentException("Price cannot be less than 0");
    } 

    this.name = name;
    this.price = price;
}

// copy constructor
public Item(Item source) {
    this.name = source.name;
    this.price = source.price;
}

//  getters
public String getName() {
    return name;
}

public double getPrice() {
    return price;
}

// setters
public void setName(String name) {
    this.name = name;
}

public void setPrice(double price) {
    this.price = price;
}

// toString

public String toString() {
    return name + ": $" + price + " ";
}


  
}
