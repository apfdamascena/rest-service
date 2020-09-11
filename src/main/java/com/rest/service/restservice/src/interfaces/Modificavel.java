package com.rest.service.restservice.src.interfaces;

import com.rest.service.restservice.src.Product;

public interface Modificavel {

    public abstract void tryToAddProduct(Product product);
    public abstract void deleteProduct(int id);
}
