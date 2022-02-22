package com.katas.demo.models;

public class FoodProduct extends Product {

    private Double discount;

    public FoodProduct(String name, Double price) {
        super(name,price);
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public Double getPrice(){
        return applyDiscount();
    }

    public Double applyDiscount(){
        Double realPrice = this.discount > 0?super.getPrice()*(1-discount/100):super.getPrice();
        return realPrice;
    }
}
