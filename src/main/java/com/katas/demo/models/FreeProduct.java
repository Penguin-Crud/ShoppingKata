package com.katas.demo.models;

public class FreeProduct {
    private String name;
    private Double price;

    public FreeProduct(String name) {
        this.name = name;
        this.price = 0.0;
    }

    public Double getPrice() {
        return price;
    }
}
