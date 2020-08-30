package com.rest.service.restservice.src;

import com.rest.service.restservice.Utils.Constants;

public class Product {

    private static long ID = 1000;
    private final String name,price;

    public Product(String ...args){
        this.name = args[Constants.NAME.value()];
        this.price = args[Constants.PRICE.value()];
        Product.ID++;
    }

    public String getName(){ return this.name; }
    public String getPrice(){ return this.price; }
}

