package com.azurewebapp;


public class Product {
    private int productId;
    private String productName;
    private int quantity;

    // Constructor
    public Product(int productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}



