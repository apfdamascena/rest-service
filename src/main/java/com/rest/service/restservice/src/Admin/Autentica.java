package com.rest.service.restservice.src.Admin;

public class Autentica {

    private int password = 1010;

    public boolean autentica(int password){
        return this.password == password;
    }
    
}
