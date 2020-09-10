package com.rest.service.restservice.Controllers;

import com.rest.service.restservice.Models.Market;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rest.service.restservice.src.Product;

import java.util.List;

@RestController
public class MarketController {

    private Market market = new Market();

    @RequestMapping("/products")
    public List<Product> market(){
        return market.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    public void addProduct(@RequestBody Product product){
        market.addProducts(product);
    }
}