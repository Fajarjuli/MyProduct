package com.example.myproduct;

public class Product {
    private String name;
    private String brand;
    private int imageResId;

    public Product(String name, String brand, int imageResId) {
        this.name = name;
        this.brand = brand;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getImageResId() {
        return imageResId;
    }
}
