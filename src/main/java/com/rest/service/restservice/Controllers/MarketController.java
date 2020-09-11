package com.rest.service.restservice.Controllers;

import com.rest.service.restservice.Models.Market;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rest.service.restservice.src.Products.Product;

import java.util.List;

@RestController
public class MarketController {

    private Market market;

    @RequestMapping("/products")
    public List<Product> market(){
        this.market = new Market();
        return market.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    public void addProduct(@RequestBody Product product){
        market.addProducts(product);
    }
}