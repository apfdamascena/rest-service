package com.rest.service.restservice.src.Admin;

import com.rest.service.restservice.database.Driver;
import com.rest.service.restservice.src.Product;

import java.sql.SQLException;

public class Modifica {

    Driver driver;

    public Modifica(){
        this.driver = new Driver();
    }

    public void addProduct(Product product) throws SQLException {
        String PRODUCT_TO_ADD = "insert into Product"
                + "(name, price, type)"
                + "values("+product.getName()+","+product.getPrice()+","+product.getType()+")";
        this.driver.executeUpdate(PRODUCT_TO_ADD);
    }

    public void deleteProduct(int id) throws  SQLException {
        String PRODUCT_TO_DELETE = "delete from Product where id=" + id;
        this.driver.executeUpdate(PRODUCT_TO_DELETE);
    }
}
