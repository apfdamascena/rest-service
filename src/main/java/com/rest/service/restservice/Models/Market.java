package com.rest.service.restservice.Models;
import java.util.ArrayList;
import com.rest.service.restservice.src.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class Market {

    private  ArrayList<Product> products = new ArrayList<Product>();

    public Market(){
        products.add(new Product("PC Gamer", "12000", "Eletronicos"));
        products.add(new Product("Mesa", "600", "Utensilios"));
    }

    public  ArrayList<Product> getAllProducts(){
        return products;
    }

    public void addProducts(Product product){
        products.add(product);
    }


}
