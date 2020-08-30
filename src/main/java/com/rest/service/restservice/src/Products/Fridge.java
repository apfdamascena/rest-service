package com.rest.service.restservice.src.Products;
import com.rest.service.restservice.src.Product;

public class Fridge extends Product {

    private final String company;


    public Fridge(String name, String price,String company){
        super(name, price);
        this.company = company;
    }

    public String getCompany() { return this.company;}
}
