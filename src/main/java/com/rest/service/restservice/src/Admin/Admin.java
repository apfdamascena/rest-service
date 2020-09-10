package com.rest.service.restservice.src.Admin;
import com.rest.service.restservice.src.Product;
import com.rest.service.restservice.src.interfaces.Modificavel;
import com.rest.service.restservice.src.interfaces.Autenticavel;
import java.util.Scanner;

public class Admin implements Modificavel, Autenticavel{

    private Modifica modificador;
    private Autentica autenticador;

    public Admin(int password){
        this.modificador = new Modifica();
        this.autenticador = new Autentica();
    }

    @Override
    public void addProduct(Product product){
        this.modificador.addProducts(product);
    }

    @Override
    public boolean autentica(int password){
        return this.autenticador.autentica(password);
    }    
}
