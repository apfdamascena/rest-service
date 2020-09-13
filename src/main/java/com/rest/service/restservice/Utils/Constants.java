package com.rest.service.restservice.Utils;

public enum Constants {
    NAME(0), PRICE(1), TYPE(2), ZERO(0),
    ONE(1);

    private final int optionToChoose ;
    Constants(int optionChosen ){
        this.optionToChoose = optionChosen;
    }

    public int value(){
        return this.optionToChoose;
    }
}
