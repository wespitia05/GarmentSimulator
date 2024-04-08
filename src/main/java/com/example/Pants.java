package com.example;

// Pants class will be child of Garment
public class Pants implements Garment {
    // initialize private String typeOfGarment
    // will be exclusive to Pants only
    // holds either professional, casual or party
    private String typeOfGarment;
    // constructor method for a new Pants object with
    // specified garment
    public Pants (String typeOfGarment) {
        this.typeOfGarment = typeOfGarment;
    }
    // overrides wear method in Garment interface
    // displays type of garment that goes with the pants
    @Override
    public void wear() {
        System.out.println (typeOfGarment + " pants");
    }
}
