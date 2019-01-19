package com.mycompany.app.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Product title is required.")
    @Basic(optional = false)
    private String title;

    @NotNull
    private double price;

    @PositiveOrZero
    private int inventory_count;

    public Product() { }

    public Product(long id, @NotNull(message = "Product title is required.") String title,
                   double price, @PositiveOrZero(message = "inventory count must be 0 or positive")int inventoryCount) {
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

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
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
