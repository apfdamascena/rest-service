package com.rest.service.restservice.Models;
import com.rest.service.restservice.src.Products.Computer;
import com.rest.service.restservice.src.Products.Fridge;
import java.util.ArrayList;

public class Market {

    private ArrayList<Fridge> fridges = new ArrayList<>();
    private ArrayList<Computer> computers = new ArrayList<>();

    public Market(String name){
        Fridge fridge = new Fridge("GH1010", "14.90", "Eletrolux");
        Fridge otherFridge = new Fridge("GH2020", "90.90", "Brastemp");
        Computer computer = new Computer("GW1920", "1200", "Developers");
        Computer otherComputer = new Computer("GW2020", "6000", "Developers 2");
        this.fridges.add(fridge);
        this.fridges.add(otherFridge);
        this.computers.add(computer);
        this.computers.add(otherComputer);
    }

    public ArrayList<Fridge> getFridges(){
        return this.fridges;
    }

    public ArrayList<Computer> getComputers(){
        return this.computers;
    }



}
