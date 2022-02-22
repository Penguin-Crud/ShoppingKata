package com.katas.demo.models;

import org.springframework.boot.context.properties.bind.DataObjectPropertyName;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Product> productsList = new ArrayList();
    private Double finalPrice;



    public Carrito() {
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }
    /*public Double getFinalPrice() {
        return
    }

    public Double sumAllPrices() {
        for (Product product : productsList) {
            finalPrice += product.getPrice()
        }
    }*/

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void add(Product product) {
        productsList.add(product);
    }
}
