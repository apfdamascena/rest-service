package com.rest.service.restservice.Models;
import java.util.ArrayList;
import com.rest.service.restservice.src.Product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class Market {

    private  List<Product> products = Arrays.asList(
        new Product("PC Gamer", "12000", "Eletronicos"),
        new Product("Mesa", "600", "Utensilios")
    );

    public  List<Product> getAllProducts(){
        return products;
    }

    public void addProducts(Product product){
        products.add(product);
    }


}
