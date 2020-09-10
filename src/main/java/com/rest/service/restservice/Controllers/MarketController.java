package com.rest.service.restservice.Controllers;

import com.rest.service.restservice.Models.Market;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {

    private Market market = new Market();

    @GetMapping("/products")
    public Market market(){
        return this.market;
    }
}