package com.dmart.store.StoreController;

public class Product {
    public long id;
    public String name;
    public long price;
    public int stock;

    //assigning values to the data members using parameterized constructor
    public Product(long id, String name, long price, int stock)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
