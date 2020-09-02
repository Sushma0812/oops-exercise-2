package com.stackroute;
/*
 *This class contains getters,setters,parameterized constructor
 */
public class ProductLineItem {
    private int id;
    private int quantity;
    private Product product;

    public ProductLineItem(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        System.out.println("ProductLineItem{id='" + this.id + "',quantity='" + this.quantity + "'}");
        return null;
    }
}
