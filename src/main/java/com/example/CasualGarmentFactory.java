package com.example;

// this class is a child of GarmentFactory and is responsible for
// creating casual garments
public class CasualGarmentFactory implements GarmentFactory {
    // creates new instance of a casual top
    public Garment createTop() {
        // returns the top with the type of garment: casual
        return new Tops("Casual");
    }
    // creates new instance of casual pants
    public Garment createPants() {
        // returns the pants with the type of garment: casual
        return new Pants("Casual");
    }
    // creates new instance of casual shoes
    public Garment createShoes() {
        // returns the pants with the type of garment: casual
        return new Shoes("Casual");
    }
}
