package com.rest.service.restservice.src.Products;
import com.rest.service.restservice.src.Product;

public class Computer extends Product {

    private final String forWhom;

    public Computer(String name, String price,String forWhom){
        super(name, price);
        this.forWhom = forWhom;
    }

    public String getForWhom() { return this.forWhom; }
}

