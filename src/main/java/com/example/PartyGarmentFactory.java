package com.example;

// this class is a child of GarmentFactory and is responsible for
// creating party garments
class PartyGarmentFactory implements GarmentFactory {
    // creates new instance of a party top
    public Garment createTop() {
        // returns the top with the type of garment: party
        return new Tops("Party");
    }
    // creates new instance of party pants
    public Garment createPants() {
        // returns the pants with the type of garment: party
        return new Pants("Party");
    }
    // creates new instance of party shoes
    public Garment createShoes() {
        // returns the pants with the type of garment: party
        return new Shoes("Party");
    }
}
