package com.mycompany.app.model;

public class Product {

    private final long id;
    private final String title;
    private final double price;
    private int inventory_count;

    public Product(long id, String title, double price, int inventoryCount) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.inventory_count = inventoryCount;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getInventory_count() {
        return inventory_count;
    }

    public void setInventory_count(int inventory_count) {
        this.inventory_count = inventory_count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", inventory_count=" + inventory_count +
                '}';
    }

    public boolean inventoryNotEmpty() {
        return inventory_count > 0;
    }
}
