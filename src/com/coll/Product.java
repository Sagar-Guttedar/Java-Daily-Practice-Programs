package com.coll;

public class Product {

    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // Getter for price
    public double getPrice() {
        return price;
    }

    // Optionally, you can add getters for other fields if needed
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String  toString() {
        return "Id :" + id + " Name : " + name + " Price : " + price;
    }


}
