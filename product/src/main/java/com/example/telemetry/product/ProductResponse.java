package com.example.telemetry.product;

import com.example.telemetry.price.Price;


public class ProductResponse {
    private long id;
    private String name;
    private Price price;


    public ProductResponse (Product product){
        this.id = product.getId();
        this.name = product.getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}