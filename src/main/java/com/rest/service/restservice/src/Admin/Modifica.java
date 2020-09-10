package com.rest.service.restservice.src.Admin;
import com.rest.service.restservice.Models.Market;
import com.rest.service.restservice.src.Product;

import java.util.ArrayList;

public class Modifica {

    private ArrayList<Product> productsMarket  = Market.getProducts();

    public void addProducts(Product product){
        this.productsMarket.add(product);
    }
}
