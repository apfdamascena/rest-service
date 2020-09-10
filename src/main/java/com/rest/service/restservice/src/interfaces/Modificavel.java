package com.rest.service.restservice.src.interfaces;

import com.rest.service.restservice.src.Product;

public interface Modificavel {

    public abstract void addProduct(Product product);
    public abstract void removeProduct(Product product);
    
}
