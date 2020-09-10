package com.rest.service.restservice.src.Admin;
import com.rest.service.restservice.src.Product;
import com.rest.service.restservice.src.interfaces.Modificavel;

public class Admin implements Modificavel {

    private int password;

    public Admin(int password){
        this.password = password;
    }

    @Override
    public void addProduct(Product product){
        
    }

    @Override
    public void removeProduct(Product product){

    }
    
}
