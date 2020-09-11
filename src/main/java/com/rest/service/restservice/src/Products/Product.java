package com.rest.service.restservice.src.Products;
import com.rest.service.restservice.Utils.Constants;

public class Product {

    private  String name,price,type;

    public Product(){} 

    public Product(String ...args){
        this.name = args[Constants.NAME.value()];
        this.price = args[Constants.PRICE.value()];
        this.type = args[Constants.TYPE.value()];
    }

    public String getName(){ return this.name; }
    public String getPrice(){ return this.price; }
    public String getType(){ return this.type; }

}
