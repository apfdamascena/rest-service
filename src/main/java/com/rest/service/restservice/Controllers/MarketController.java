package com.rest.service.restservice.Controllers;

import com.rest.service.restservice.Models.Market;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rest.service.restservice.src.Product;
import com.rest.service.restservice.src.Admin.Admin;

@RestController
public class MarketController {

    private Market market = new Market();
    private Admin administrador = new Admin(1010);;

    @RequestMapping("/products")
    public Market market(){
        return this.market;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/admin")
    public void addProduct(@RequestBody Product product){
        this.administrador.addProduct(product);
    }
}