package com.rest.service.restservice.src;
import com.rest.service.restservice.Utils.Constants;

public class Product {

    private static long ID = 1000;
    private  String name,price,type;

    public Product(){} 

    public Product(String ...args){
        this.name = args[Constants.NAME.value()];
        this.price = args[Constants.PRICE.value()];
        this.type = args[Constants.TYPE.value()];
        Product.ID++;
    }

    public String getName(){ return this.name; }
    public String getPrice(){ return this.price; }
    public String getType(){ return this.type; }
    public void setName(String name){ this.name = name; }
    public void setPrice(String price){ this.price = price;}
    public void setType(String type){ this.type = type; }
}
