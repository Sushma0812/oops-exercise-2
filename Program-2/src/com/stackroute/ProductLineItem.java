package com.stackroute;

public class ProductLineItem {
    private int id;
    private int quantity;
    private Product product;

    public void ProductLineItem(int id,int quantity,Product product){
        this.id = id;
        this.quantity = quantity;
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
}
