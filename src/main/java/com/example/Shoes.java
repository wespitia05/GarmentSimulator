package com.example;

// Shoes class will be child of Garment
public class Shoes implements Garment {
    // initialize private String typeOfGarment
    // will be exclusive to Shoes only
    // holds either professional, casual or party
    private String typeOfGarment;
    // constructor method for a new Shoes object with
    // specified garment
    public Shoes (String typeOfGarment) {
        this.typeOfGarment = typeOfGarment;
    }
    // overrides wear method in Garment interface
    // displays type of garment that goes with the shoe
    @Override
    public void wear() {
        System.out.println (typeOfGarment + " shoes");
    }
}
