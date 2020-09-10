package com.rest.service.restservice.Models;
import java.util.ArrayList;
import com.rest.service.restservice.src.Product;

public class Market {

    private static ArrayList<Product> products = new ArrayList<Product>();

    public Market(){
        Product produto1 = new Product("PC Gamer", "12000", "Eletronicos");
        Product produto2 = new Product("Mesa", "600", "Utensilios");
        products.add(produto1);
        products.add(produto2);
    }

    public static ArrayList<Product> getProducts(){
        return products;
    }
}
