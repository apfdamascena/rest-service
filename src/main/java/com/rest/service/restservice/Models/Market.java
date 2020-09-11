package com.rest.service.restservice.Models;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.rest.service.restservice.database.Driver;
import com.rest.service.restservice.src.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class Market {

    private ArrayList<Product> products = new ArrayList<Product>();
    private Driver driver = new Driver();
    private String selectProducts = "select * from Product";
    private ResultSet result;


    public Market(){
        try {
            this.result = this.driver.tryToGetResult(selectProducts);
            this.readResultAndInsertToProducts();
        } catch (Exception execution){
            execution.printStackTrace();
        }
    }

    public  ArrayList<Product> getAllProducts(){
        return products;
    }

    public void addProducts(Product product){
        products.add(product);
    }

    private void readResultAndInsertToProducts() throws SQLException {
        while(this.result.next()){
            String name = this.result.getString("name");
            String price = this.result.getString("price");
            String type = this.result.getString("type");
            this.insertToProducts(name, price, type);
        }
    }

    private void insertToProducts(String name, String price, String type){
        Product productToAdd = new Product(name, price, type);
        this.addProducts(productToAdd);
    }


}
