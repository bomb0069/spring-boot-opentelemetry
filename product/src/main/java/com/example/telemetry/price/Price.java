package com.example.telemetry.price;

public class Price {
    private long productId;
    public long getProductId() {
        return productId;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
    private double priceAmount;
    public double getPriceAmount() {
        return priceAmount;
    }
    public void setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
    }
    private double discount;
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
}
