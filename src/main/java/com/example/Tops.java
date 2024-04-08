package com.example;

public class Tops implements Garment {
    // initialize private String typeOfGarment
    // will be exclusive to Tops only
    // holds either professional, casual or party
    private String typeOfGarment;
    // constructor method for a new Tops object with
    // specified garment
    public Tops (String typeOfGarment) {
        this.typeOfGarment = typeOfGarment;
    }
    // overrides wear method in Garment interface
    // displays type of garment that goes with the top
    @Override
    public void wear() {
        System.out.println (typeOfGarment + " top");
    }
}
